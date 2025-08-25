package javaProject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
	public static  void main(String[] args) {
//		Arithmatic ath = (x,y) -> {
//			System.out.println("result");
//			return (x+y);
//		};
//		int a = ath.add(10,5);
//		System.out.println(a);
//		
//		ath.display();
//		Arithmatic.message();
		
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(109,"testUser4",3760.8));
		empList.add(new Employee(111,"testUser2",8998.8));
		empList.add(new Employee(106,"testUser3",8990.8));

		Collections.sort(empList, (emp1,emp2)->{
			return emp1.getName().compareTo(emp2.getName());
		});
		
		Collections.sort(empList, (emp1,emp2)->{
			return (int) (emp2.getSalary() - emp1.getSalary());
		});
		
		
//		System.out.println(empList);
		for(Employee emp : empList) {
			System.out.println(emp.getCode()+ " " + emp.getName()+ " " + emp.getSalary());
		}
		
//		TreeSet<Employee> empTreeSet = new TreeSet<Employee>();
//		
//		empTreeSet.add(new Employee(109,"sumit",7000));
//		empTreeSet.add(new Employee(108,"aumit",6000));
//		empTreeSet.add(new Employee(111,"test",9000));
//
//		for(Employee emp : empTreeSet) {
//			System.out.println(emp.getCode()+ " " + emp.getName()+ " " + emp.getSalary());
//		}
		
		

		
//		stdList.add(new Student())
		
	}
}
