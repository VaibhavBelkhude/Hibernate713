package com.nt.test;

import com.nt.dao.StudentDAOImpl;
import com.nt.util.HibernateUtil;

public class CollectionMapping_LIST_Map_Test {

	public static void main(String[] args) {
		
				//create DAO class object
				StudentDAOImpl dao=new StudentDAOImpl();
				dao.saveData();
				// dao.displayData();
				//close SessionFactory
				HibernateUtil.closeSessionFactory();
			}
	}


