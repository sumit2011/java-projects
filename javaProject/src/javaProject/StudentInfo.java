package javaProject;

import java.util.ArrayList;

public class StudentInfo {

	public static void main(String[] args) {
		
		ArrayList<Student2> stdList = new ArrayList<Student2>();
		stdList.add(new Student2(1,"sumit"));
		
		System.out.println(stdList);
		String quote = """
				"hiiii................."
				 """;
		System.out.println("James Gesling released a white paper saying: ");
		System.out.println("\" Multiple inheritance is not allowed in java!\"");
		System.out.println(quote);
		
		int category  = 1;
		switch(category) {
		case 1-> System.out.println("40%");
		case 2-> System.out.println("60%");
		default-> System.out.println("No Discount!"); 
		}
		
		
		String day = "dec";
		String msg = switch(day) {
		case "sun" -> {yield "happy day";}
		default -> "invalid day";
		};
		
		System.out.println(msg);

		

	}
}
