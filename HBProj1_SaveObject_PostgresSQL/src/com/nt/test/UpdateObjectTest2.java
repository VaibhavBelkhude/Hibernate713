package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Actor;

public class UpdateObjectTest2 {
public static void main(String[] args) {
	
	//activate hibernate f/w
	Configuration cfg=new Configuration();
	cfg.configure("com/nt/cofig/hibernate.cfg.xml");
	//creat HB session factory object
	SessionFactory factory=cfg.buildSessionFactory();
	System.out.println("buildSessionFactory::"+factory.getClass());
	//create HB session object
	Session ses=factory.openSession();
	System.out.println("session::-"+ses.getClass());
	//prepare entity class object
	Actor actor=new Actor();
	actor.setActorId(1003); actor.setActorName("Mrutunjay Belkhude");
	actor.setActorAddrs("Nagpur1");
	actor.setPhone("+91-7058826548");
	actor.setEnumeration(8000000.0f);
	
	Transaction tx=null;
	boolean flag=false;
	try {
		tx=ses.beginTransaction(); //internally call con.SetAutoCommit(false)
		//execute logic
	//	int idVal=(int) ses.save(actor);
	//	System.out.println("Generated Value::-"+idVal);
		ses.update(actor);
		flag=true;
		
	}//try
	catch(HibernateException he) {
		flag=false;
		he.printStackTrace();
		
		System.out.println("updateObjectTest.main()");
	}
	catch(Exception e) {
		flag=false;
		e.printStackTrace();
		
	}
finally {
	if(flag) {
		tx.commit();
		System.out.println("UpdateObjectTest------>update data into DB table as records");
	}
	else {
		tx.rollback();
		System.out.println("----object not update----");
	}
}//finally
	//close object
	ses.close();
	factory.close();
	
   }//main
}//class
