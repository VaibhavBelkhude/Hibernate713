package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Student;

public class SaveObjectTest1 {
	
	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		Boolean flag=false;
		
		cfg=new Configuration();
		cfg=cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
		ses=factory.openSession();
		//entity class object creation
		Student st=new Student();
		st.setSid(124);st.setSname("RAJ");
		st.setSaddr("pune"); st.setPhone(7507514349l);
		st.setFees(4562.0f);
		try {
			tx=ses.beginTransaction();
			ses.save(st);
			flag=true;
		}//try
		catch(HibernateException he) {
			flag=false;
			he.printStackTrace();
			
		}
		catch(Exception e) {
			flag=false;
			e.printStackTrace();
		}
		finally {
			if(flag) {
				tx.commit();
				System.out.println("Object is Save Successfully");
			}
			else {
				tx.rollback();
				System.out.println(" Object is Not Save");
			}//finally
			//close object
			ses.close();
			factory.close();
		}
	}

}
