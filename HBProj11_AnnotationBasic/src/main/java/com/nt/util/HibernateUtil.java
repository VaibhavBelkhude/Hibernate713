package com.nt.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	static {
		System.out.println("static Block---->");
		//Boostrap Hibernate cfg
		try {
		Configuration cfg=new Configuration();
		cfg.configure("com/nt/cfg/hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
		}//try
		catch(HibernateException he) {
			he.printStackTrace();
		}
			
	}//static
	public static SessionFactory  getSessionFactory(){
		return factory;
	}//SessionFactory 
	public static Session getSession() {
		Session ses=null;
		if(factory!=null)
			ses=factory.openSession();
		return ses;
	//close object	
	}//session
	public static void closeSessionFactory() {
		if(factory!=null)
			factory.close();
	} //factory.close
	public static void closeSession(Session ses) {
		if(ses!=null)
			ses.close();
	}//ses.close
}//class
