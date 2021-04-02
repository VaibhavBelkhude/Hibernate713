package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nt.service.InsurancePolicy;
import com.nt.util.HibernateUtil;

public class SaveObjectTest {

	public static void main(String[] args) {
	   // GEt SessionFactory object
		Transaction tx=null;
		try(SessionFactory factory=HibernateUtil.getSessionFactory()){
		      try(Session ses=HibernateUtil.getSession()){
		           tx=ses.beginTransaction();
		            //save object 
		            InsurancePolicy policy=new InsurancePolicy();
		           policy.setPolicyId(1200l); 
		            policy.setPolicyName("JA++");
		            policy.setCompany("LIC"); policy.setTenure(25.0f);
		            
		            InsurancePolicy policy1=new InsurancePolicy();
		           policy1.setPolicyId(12000l);
		              policy1.setPolicyName("JS++");
		            policy1.setCompany("SBI"); policy1.setTenure(15.0f);

		            long idVal=(long)ses.save(policy);
		            long idVal1=(long)ses.save(policy1);
		            
		    	     tx.commit();
		    	     System.out.println("Objects saved with idvals::"+idVal+" "+idVal1);
		      }//try2
		}//try1
		catch(HibernateException he) {
			he.printStackTrace();
			tx.rollback();
			System.out.println("Object is not saved");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Object is not saved");
		}
		

	}//main
}//class