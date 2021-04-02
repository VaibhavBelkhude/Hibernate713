package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nt.entity.BankAccount;
import com.nt.util.HibernateUtil;

public class CustomerDetails {
	public static void main(String[] args) {
		   // GEt SessionFactory object
			Transaction tx=null;
			try(SessionFactory factory=HibernateUtil.getSessionFactory()){
			      try(Session ses=HibernateUtil.getSession()){
			           tx=ses.beginTransaction();
			            //save object 
			        
			        BankAccount ba=new BankAccount();
			        ba.setAccNumber(1245678);ba.setACHName("Vaibhav");
			        ba.setACHMname("Vitthal");ba.setACHLname("Belkhude");
			        ba.setACHAddress("Anand Nagar Bhadrawati");
			        ba.setEmail("vaibhavbelkhude333@gmail.com");
			        ba.setPhone("+91-7058826543");ba.setNominies("Vitthal Belkhude");
			      //  ba.setOpeningdate();
			          
			    	    
			    	     Integer idVal=(Integer)ses.save(ba);
			    	    System.out.println("Object saved with idval::"+idVal);
			    	    tx.commit();
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