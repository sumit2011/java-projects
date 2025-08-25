package javaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentResult {
	public static void main(String[] args) {
		
		ArrayList<Student> stdList = new ArrayList<Student>();
		System.out.println("Enter Details of the student: ");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<1 ; i++) {
			System.out.print("name: ");
			String name = sc.nextLine();
			System.out.print("regno: ");
			int regno = sc.nextInt();
			sc.nextLine();
			System.out.print("sub1 marks: ");
			int sub1 = sc.nextInt();
			sc.nextLine();
			System.out.print("sub2 marks: ");
			int sub2 = sc.nextInt();
			sc.nextLine();
			System.out.print("sub3 marks: ");
			int sub3 = sc.nextInt();
			sc.nextLine();
			
			stdList.add(new Student(regno, name, sub1,sub2,sub3));
			
		}
		
		for(Student std : stdList) {
//			System.out.println(std.getRegNo()+ " " + std.getStudentName()+ " " + std.getSub1Marks());
			
			
			System.out.println(std.getStudentName());
			int total = std.getSub1Marks()+std.getSub1Marks()+std.getSub1Marks();
			double avg = total/3;
			System.out.println(avg);

			if( std.getSub1Marks()< 40 ||std.getSub2Marks() <40 || std.getSub1Marks() <40) {
				System.out.println("fail");
			}else {
				System.out.println("pass");
			}
		}

	}
	
}
