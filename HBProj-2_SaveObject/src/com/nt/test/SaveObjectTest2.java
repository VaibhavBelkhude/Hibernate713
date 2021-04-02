package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.nt.entity.Customer;

public class SaveObjectTest2 {
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
	//create domain class object with data
			Customer cd=new Customer();
			cd.setCno(12035);cd.setCname("Raja");
			cd.setCaddrs("pune");
			cd.setPhone(976406326);cd.setEmail("Vbelkhude@gmail.com");
			cd.setCproduct("Laptop");
	Transaction tx=null;
	boolean flag=false;
	try {
		tx=ses.beginTransaction(); //internally call con.SetAutoCommit(false)
		//execute logic
		int idVal=(int) ses.save(cd);
		System.out.println("Generated Value::-"+idVal);
		//ses.save(cust);
		flag=true;
		
	}//try
	catch(HibernateException he) {
		flag=false;
		he.printStackTrace();
		
		System.out.println("SaveObjectTest.main()");
	}
	catch(Exception e) {
		flag=false;
		e.printStackTrace();
		
	}
finally {
	if(flag) {
		tx.commit();
		System.out.println("SaveObjectTest------>insert data into DB table as records");
	}
	else {
		tx.rollback();
		System.out.println("----object not save----");
	}
}//finally
	//close object
	ses.close();
	factory.close();
	
   }//main
}//class
