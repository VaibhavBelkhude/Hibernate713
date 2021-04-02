package com.nt.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernatUtil {
private static SessionFactory factory;
static {
	try {
		Configuration cfg=new Configuration();
		cfg.configure("/com/nt/cfg/hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
	}//try
	catch(HibernateException he) {
		he.printStackTrace();
	}	
	}//catch
	public static  SessionFactory getSessionFactory() {
		 return factory;
}

public  static   Session getSession() {
	Session ses=null;
	if(factory!=null)
		ses=factory.openSession();
	return ses;
}

public static void closeSessionFactory() {
	if(factory!=null)
		factory.close();
}

public static void closeSession(Session ses) {
	if(ses!=null)
		ses.close();
}


}
