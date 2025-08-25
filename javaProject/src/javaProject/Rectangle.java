package javaProject;

public non-sealed class Rectangle extends Shape {

	public Rectangle(double length, double width) {
		super(length, width);
		
	}
	
	public double calculateArea(double length, double width) {
		return length*width;
	}

	public static void main(String [] args) {
		
	}
	
}
