package javaProject;

public  class Student {
	private int regNo;
	private String studentName;
	private int sub1Marks;
	private int sub2Marks;
	private int sub3Marks;
	public Student(int regNo, String studentName, int sub1Marks, int sub2Marks, int sub3Marks) {
		super();
		this.regNo = regNo;
		this.studentName = studentName;
		this.sub1Marks = sub1Marks;
		this.sub2Marks = sub2Marks;
		this.sub3Marks = sub3Marks;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getSub1Marks() {
		return sub1Marks;
	}
	public void setSub1Marks(int sub1Marks) {
		this.sub1Marks = sub1Marks;
	}
	public int getSub2Marks() {
		return sub2Marks;
	}
	public void setSub2Marks(int sub2Marks) {
		this.sub2Marks = sub2Marks;
	}
	public int getSub3Marks() {
		return sub3Marks;
	}
	public void setSub3Marks(int sub3Marks) {
		this.sub3Marks = sub3Marks;
	}
	
}
