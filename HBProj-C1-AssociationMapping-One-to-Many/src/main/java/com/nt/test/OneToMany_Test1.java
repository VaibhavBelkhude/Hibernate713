package com.nt.test;

import com.nt.dao.IOneToManyDAO;
import com.nt.dao.OneToManyDAOImpl;
import com.nt.util.HibernateUtil;

public class OneToMany_Test1 {

	public static void main(String[] args) {
		//get DAO
				IOneToManyDAO dao=new OneToManyDAOImpl();
				dao.SaveData();
		      //close SessionFactory
				HibernateUtil.closeSessionFactory();

	}

}
