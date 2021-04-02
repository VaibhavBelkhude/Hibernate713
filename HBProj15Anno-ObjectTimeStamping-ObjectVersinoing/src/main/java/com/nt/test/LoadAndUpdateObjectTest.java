package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.CallerTune;
import com.nt.util.HibernateUtil;

public class LoadAndUpdateObjectTest {
	public static void main(String[] args) {
		Transaction tx=null;
		//get SessionFactory
		try(SessionFactory factory=HibernateUtil.getSessionFactory()){
					//get Session
				try(Session ses=factory.openSession()){
					tx=ses.beginTransaction();
					//Load object
					CallerTune tune1=ses.get(CallerTune.class,2);
					//modify object
					tune1.setProvider("Airtel");
					tune1.setCallerTune("samsung music1");
					tx.commit();
					System.out.println("Object is lastly updated at::"+tune1.getLastUpdated()+"  created On::"+tune1.getCreatedOn()+" and modified for  "+tune1.getChangesCount()+" times");
			}//try
		}//try
		catch(HibernateException he) {
			he.printStackTrace();
			tx.rollback();
			System.out.println("Object is not updated");
		}
		catch(Exception e) {
			 e.printStackTrace();
				tx.rollback();
				System.out.println("Object is not updated");
		}

	}//main
}//class