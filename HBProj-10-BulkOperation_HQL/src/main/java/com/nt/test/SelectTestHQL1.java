package com.nt.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.nt.model.Employee;
import com.nt.util.HibernateUtil;


public class SelectTestHQL1 {
public static void main(String[] args) {
	// Get SesssionFactory and Session objects
			try (SessionFactory factory = HibernateUtil.getSessionFactroy(); Session ses = factory.openSession()) {
					//prepare Query object representing HQL query
					//Query query=ses.createQuery("FROM  com.nt.model.Employee");
				//	Query query=ses.createQuery("FROM  Employee");
					//Query query=ses.createQuery("FROM  Employee  as e");
					//Query query=ses.createQuery("FROM  Employee   e");
					//Query query=ses.createQuery("SELECT  * FROM  Employee ");  //wrong query
					//Query query=ses.createQuery("SELECT  e FROM  Employee e ");
				//Employee emp=new Employee();	
					//execute  HQL 
				/*	List<Employee> list=query.getResultList();  //or query.list() 
					//process the result
					list.forEach(emp->{
						System.out.println(emp);
					});
					*/
					//list.forEach(System.out::println);
					  //HQL Select with ordinal positional params
					//Query query=ses.createQuery("FROM  Employee WHERE  salary>=?2 and salary<=?1");
					//Query query=ses.createQuery("FROM  Employee WHERE  Esal>=?1 and Esal<=?2");
					/*Query query=ses.createQuery("FROM  Employee WHERE  Esal>=?1 or Esal<=?2");
					query.setParameter(1, 15000.0f);
					query.setParameter(2, 25060.0f);
					List<Employee> list=query.getResultList();
					list.forEach(System.out::println);
					System.out.println(list);*/
					  //HQL Select with named  params
						Query query=ses.createQuery("FROM  Employee WHERE Eaddr IN(:city1,:city2,:city3)");
						query.setParameter("city1", "Pune");
						query.setParameter("city2", "mumbai");
						query.setParameter("city3", "Nagpur");
						List<Employee> list=query.getResultList();
						list.forEach(System.out::println);
						System.out.println("......................");
						
				/*		query.setParameter("Eaddr1", "Pune");
						query.setParameter("Eaddr2", "Nagpur");
						query.setParameter("Eaddr3", "Mumbai");
						List<Employee> list1=query.getResultList();
						list1.forEach(System.out::println);*/
						
								
								
					
								/*	//HQL Select with named  params and Lazy Loading
									Query query=ses.createQuery("FROM  Employee WHERE ename LIKE :initChars");
									query.setParameter("initChars", "r%");
									Iterator<Employee> it=query.iterate();
									while(it.hasNext()) {
										Employee emp=it.next();
										System.out.println(emp);
									} */
					
					//HQL supports nested Queries and also aggrate functions
				/*	Query query=ses.createQuery("FROM  Employee   WHERE Esal=(SELECT MAX(Esal) FROM  Employee)");
					List<Employee> list=query.list();
					list.forEach(System.out::println);
					*/
				/*	Query query=ses.createQuery("FROM  Employee   WHERE Esal=(SELECT MIN(Esal) FROM  Employee)");
					List<Employee> list=query.list();
					list.forEach(System.out::println);
*/
				} // try
				catch (HibernateException he) {
					he.printStackTrace();
				}

			}// main

		}// class