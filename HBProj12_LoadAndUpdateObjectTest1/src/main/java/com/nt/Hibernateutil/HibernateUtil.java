package com.nt.Hibernateutil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

private static SessionFactory factory;
static {
	
	try {
		Configuration cfg=new Configuration();
		cfg.configure("com/nt/cfg/hibernate.cfg.xml");
		//create session factory object
		factory=cfg.buildSessionFactory();
		
	}
	catch(HibernateException he) {
		he.printStackTrace();
	}//try
	
}//static

// create session object
public static Session getSession(){
	Session ses=null;
	if(factory!=null)
		ses=factory.openSession();
	return ses;
  }//ses

//close session object
public static void closeSession(Session ses) {
	if(ses!=null)
		ses.close();
} //close ses

//close session factory object
public static SessionFactory closeSessionFactory() {
	if(factory!=null)
		factory.close();
	return factory;
}//factory close
}

