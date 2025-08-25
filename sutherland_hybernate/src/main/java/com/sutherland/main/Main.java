package com.sutherland.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sutherland.entity.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config = new Configuration();
		
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		Employee emp1 = new Employee();
		emp1.setEmpId(190);
		emp1.setEmpName("test123");
		emp1.setSalary(1233);
		
		session.save(emp1);
		tran.commit();
		session.close();
		factory.close();
		
		
	}

}
