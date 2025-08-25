package jbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(Beanconfiguration.class);
		Account acnt = ctx.getBean("getAccount", Account.class);
		System.out.println(acnt.getAcno()+" " + acnt.getBalance() + " "+ acnt.getCustname());
		
	}
}
