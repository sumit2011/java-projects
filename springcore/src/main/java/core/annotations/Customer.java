package core.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import main.Address;

@Component(value= "cust")
public class Customer {
	@Value("3456")
	private int custCode;
	@Value("suther")
	private String custName;
	@Autowired
	private Address address;
	
	public int getCustCode() {
		return custCode;
	}
	public void setCustCode(int custCode) {
		this.custCode = custCode;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
