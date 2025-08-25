package javaProject;

public interface Arithmatic {
	int add(int x, int y);
	default void display() {
		System.out.println(" This is a default method....");	
	}
	static void message() {
		System.out.println("This is a static method....");
	}
}
