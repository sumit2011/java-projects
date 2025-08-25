package main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("123")
	private String strtno;
	@Value("ap")
	private String state;
	
	public String getStrtno() {
		return strtno;
	}
	public void setStrtno(String strtno) {
		this.strtno = strtno;
	}
	public String getState() {
		return state;
	}
	@Override
	public String toString() {
		return "Address [strtno=" + strtno + ", state=" + state + "]";
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
