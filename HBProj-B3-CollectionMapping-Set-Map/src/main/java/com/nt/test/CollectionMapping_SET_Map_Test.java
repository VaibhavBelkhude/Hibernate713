package com.nt.test;

import com.nt.dao.TravellerDAOImpl;
import com.nt.util.HibernateUtil;

public class CollectionMapping_SET_Map_Test {

	public static void main(String[] args) {
		
				//create DAO class object
				TravellerDAOImpl dao=new TravellerDAOImpl();
				dao.saveData();
				// dao.displayData();
				//close SessionFactory
				HibernateUtil.closeSessionFactory();
			}
	}


