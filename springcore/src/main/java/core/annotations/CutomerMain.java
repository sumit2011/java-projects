package core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.Employee;

public class CutomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("Annotationbased.xml");
		Customer cust = (Customer) ctx.getBean("cust",Customer.class);
		System.out.println(cust.getCustCode()+" "+ cust.getCustName()+" " +cust.getAddress());
	}

}
