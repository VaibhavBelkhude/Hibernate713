package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.nt.bean.JobDetails;
import com.nt.bean.Person;
import com.nt.util.HibernateUtil;

public class ComponentMappingInsertTest {

	public static void main(String[] args) {
		Transaction tx=null;
		try(SessionFactory factory=HibernateUtil.getSessionFactory();
				 Session ses=factory.openSession()){
			  //prepare object
			Person per=new Person("Raja","Pune",
					                                new JobDetails("SALESMAN","ICICI BANK",70000.0f));
			//begin Tx
			tx=ses.beginTransaction();
			  int idval=(int) ses.save(per);
			tx.commit();
			System.out.println("object is  saved with idVal:: "+idval);
		}//try
		catch(HibernateException he) {
			he.printStackTrace();
			if(tx!=null && tx.getStatus()!=null && tx.getRollbackOnly())
				tx.rollback();
		}
		

	}//main
}//class