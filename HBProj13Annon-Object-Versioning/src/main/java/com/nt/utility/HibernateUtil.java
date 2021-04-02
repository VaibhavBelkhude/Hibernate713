package com.nt.utility;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.web.servlet.server.Session;

public class HibernateUtil {

private static SessionFactory factory;
static {
	
	try {
		Configuration cfg=new Configuration();
		cfg.configure("com/nt/cofig/hibernate.cfg.xml");
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
public static void closeSessionFactory() {
	if(factory!=null)
		factory.close();
}//factory close
}

