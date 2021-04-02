package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Student;

public class SaveObjectTest {
public static void main(String[] args) {
	//Activate Hibernate frameworks
	Configuration cfg=new Configuration();
	//Configure hibernate file
	cfg=cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
//SeesionFactory represent jdbc connection pool i.e create base on hibernate cfg file
	SessionFactory factory=cfg.buildSessionFactory();
	System.out.println("factory obj class name::"+factory.getClass());
	//session object encapsulate jdbc conn object
	Session ses=factory.openSession();
	System.out.println("Session obj class name::"+ses.getClass());
	//prepare Entity class object
	Student st=new Student();
	st.setSid(1002); st.setSname("RAJ");
	st.setSaddr("pune");st.setFees(4500.0f);
	
	Transaction tx=null;
	Boolean flag=null;
	try {
		ses.beginTransaction();//  internally calls  con.setAutoCommit(false) 
	int idVal=(int)ses.save(st);	
	System.out.println("Generated idvalue::"+idVal);
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
		if (flag) {
			tx.commit();
			
		}
		else {
			tx.rollback();
		}
		//close obect
		  ses.close();
		  factory.close();
	}//finlly		
	
}//method
}//class
