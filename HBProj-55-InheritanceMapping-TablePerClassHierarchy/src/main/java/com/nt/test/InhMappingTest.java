package com.nt.test;


import com.nt.dao.InheritanceMappingDAOImpl;
import com.nt.util.HibernateUtil;

public class InhMappingTest {

	public static void main(String[] args) {
		InheritanceMappingDAOImpl dao=new InheritanceMappingDAOImpl();
		 dao.saveData();
		// dao.loadData();
		 
		 //close SessionFactory
		 HibernateUtil.closeSessionFactory();
	}//main
}//class
