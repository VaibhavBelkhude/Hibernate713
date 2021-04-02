package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nt.entity.School;
import com.nt.id.Schoolid;
import com.nt.util.HibernatUtil;

public class HikariConnectionProviderSaveObjectTest1{
 public static void main( String[] args ){
	//get SessionFactory object
			Transaction tx=null; 
			// int idVal=0;
			try(SessionFactory factory=HibernatUtil.getSessionFactory()){
				try (Session ses=factory.openSession()){
	//begin Tx
	tx=ses.beginTransaction();
	  //prepare object
       Schoolid cs=new Schoolid();
        cs.setSchoolid(12006);cs.setCourseId(1206);
        School st=new School();
        st.setId(cs);;
        st.setSchname("VaibhavInter");
        st.setSname("Gajanan");
        st.setAddr("yavatmal");
        st.setCourseName("MPSC");
        st.setStudentSize(20);
        
        Schoolid  idVal=(Schoolid)
        		ses.save(st);
         System.out.println("Generated id value::"+idVal.toString());
					  tx.commit();	
				}//try2
			}//try1
			catch(HibernateException he) {
				if(tx!=null || tx.getStatus()!=null || tx.getRollbackOnly())
					  tx.rollback();
				he.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}

    }
}
