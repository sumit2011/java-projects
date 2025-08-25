package com.sutherland.main;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sutherland.entity.Employee;


public class EditEmployee {

	
	
	public static void main(String[] args) {
		Configuration config = new Configuration();
		
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		Employee emp1 = session.get(Employee.class, 123);
		TypedQuery<Employee> qry = session.createQuery("from Employee");
		List<Employee> emplist = qry.getResultList();
		for(Employee emp : emplist) {
			System.out.println(emp);
		}
		session.close();
		factory.close();
	}
	
}
