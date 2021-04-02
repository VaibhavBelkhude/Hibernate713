package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.service.InsurancePolicy;
import com.nt.util.HibernateUtil;

public class MyThread extends Thread{
public void run() {
	Transaction tx=null;
	try(Session ses=HibernateUtil.getSession()){
		tx=ses.beginTransaction();
		InsurancePolicy policy1=new InsurancePolicy();
	
         policy1.setPolicyName("Health Insu++");
         policy1.setCompany("LIC"); policy1.setTenure(25.0f);
         
         InsurancePolicy policy2=new InsurancePolicy();
		 
         policy2.setPolicyName("car Insu++");
         policy2.setCompany("BajajFinance"); policy2.setTenure(25.0f);
         
         InsurancePolicy policy3=new InsurancePolicy();
		
         policy3.setPolicyName("Term Insu++");
         policy3.setCompany("ICICIPro"); policy3.setTenure(25.0f);
        // long idVal1=(long)ses.save(policy1);
         long idVal1=(long)ses.save(policy1);
         long idVal2=(long)ses.save(policy2);
         long idVal3=(long)ses.save(policy3);
         tx.commit();
       //  System.out.println("Objects saved with idvals::"+idVal1  );
         System.out.println("Objects saved with idvals::"+idVal1 +""+idVal2+"" +idVal3 );
	}//try
	catch(HibernateException he) {
		he.printStackTrace();
		tx.rollback();
		System.out.println("Object is not saved");
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("Object is not saved");
	}//
}//run
}//class
