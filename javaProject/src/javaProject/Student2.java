package javaProject;

public record  Student2(int regNo, String name) {

	public int regNo() {
		return regNo;
	}

	public String name() {
		return name;
	}

	
}


