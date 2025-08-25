package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("springconfig.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp.getCode()+" "+ emp.getEmpname()+" " +emp.getSalary()+" "+ emp.getAddr());

	}
}
