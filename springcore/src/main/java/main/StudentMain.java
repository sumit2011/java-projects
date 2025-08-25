package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("springconfig.xml");
		Student std = (Student) ctx.getBean("std");
		System.out.println(std.getRegNo()+" "+ std.getStdName());

	}

}
