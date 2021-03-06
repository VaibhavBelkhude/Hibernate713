package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Actor;
import com.nt.uitl.HibernateUtil;


public class SaveObjectTest1 {
	 public static void main(String[] args) {
	 //Get HB Session obj
	 Session ses=HibernateUtil.getSession();
	 try {
	 Actor actor=ses.get(Actor.class,1);
	 if(actor==null)
	 System.out.println("Actor not found");
	 else
	 System.out.println(actor);
	 }
	 catch(HibernateException he) {
	 he.printStackTrace();
	 }
	 catch(Exception e) {
	 e.printStackTrace();
	 }
	 finally {
	 //close Session obj (connecƟon closing)
	 HibernateUtil.closeSession(ses);
	 //close SessionFactory object
	 HibernateUtil.closeSessionFactory();
	 }//finally


	 }//main
	 }//class