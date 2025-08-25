package main;

public class Student {

	private int regNo;
	private String stdName;
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public Student(int regNo, String stdName) {
		super();
		this.regNo = regNo;
		this.stdName = stdName;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	
	
}
