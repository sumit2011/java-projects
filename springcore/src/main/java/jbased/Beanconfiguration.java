package jbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beanconfiguration {

	@Bean
	public Account getAccount() {
		Account acn = new Account();
		acn.setAcno(123456);
		acn.setCustname("sumit");
		acn.setBalance(9000);
		return acn;
	}
	
	
}
