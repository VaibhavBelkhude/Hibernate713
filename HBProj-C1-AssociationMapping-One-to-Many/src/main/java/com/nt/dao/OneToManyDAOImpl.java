package com.nt.dao;

import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.BankAccount;
import com.nt.entity.Person;
import com.nt.util.HibernateUtil;

public class OneToManyDAOImpl implements IOneToManyDAO{

	@Override
	public void SaveData() {
		Transaction tx=null;
		try(Session ses=HibernateUtil.getSession()){
			Set<BankAccount> accounts=Set.of(new BankAccount("savings","SBI",656565.0),
                                             new BankAccount("savings","SBH",656665.0));
			Person per=new Person("Vaibhav","Pune",accounts);
			
			 tx=ses.beginTransaction();
			    //save objs
			 ses.save(per);
			 tx.commit();
			 System.out.println("Objects is saved (parent to child)");
		}
		catch(HibernateException he) {
			he.printStackTrace();
			if(tx!=null || tx.getStatus()!=null||tx.getRollbackOnly())
					tx.rollback();
		}//catch
	}//method

}//class
