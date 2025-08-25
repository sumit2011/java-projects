package javaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.*;



public class FilterExample {

	
	
	
	public static void main(String[] args) {
	    ArrayList<Employee> empList = new ArrayList<Employee>();
	    empList.add(new Employee(109,"testUser4",3760.8));
	    empList.add(new Employee(111,"testUser2",8998.8));
	    empList.add(new Employee(106,"testUser3",8990.8));

	    // Filter employees with salary > 7000
	    List<Employee> salaryWise = empList.stream()
	            .filter(emp -> emp.getSalary() > 7000)
	            .collect(Collectors.toList());

	    Scanner sc = new Scanner(System.in);

	    while (true) {
	        try {
	            System.out.print("Enter Employee ID: ");
	            int id = sc.nextInt();
	            sc.nextLine(); 

	            

	            Optional<Employee> emp1 = empList.stream()
	                    .filter(emp -> emp.getCode() == id)
	                    .findFirst();

	            if (emp1.isEmpty()) {
	                throw new EmployeeNotFoundException();
	            } else {
	                System.out.println( emp1);
	            }
	        } catch (EmployeeNotFoundException e) {
	            System.out.println("Exception: " + e.getMessage());
	        } 
	    }
	}

}
