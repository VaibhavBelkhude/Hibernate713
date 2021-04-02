package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nt.service.InsurancePolicy;
import com.nt.util.HibernateUtil;

public class SaveObjectTestInClusterEnv {
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
			        
			            long idVal=(long)ses.save(policy);
			            System.out.println("Generated idvals::"+idVal);
			            System.out.println(" Sleeping......run other app for simultaneous ");
			            Thread.sleep(20000);
			            
			    	     tx.commit();
			    	     System.out.println("Objects saved with idvals::"+idVal);
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