package javaProject;

public sealed class Shape permits Rectangle {
	private double length;
	private double width;
	private double radius;
	public Shape(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Shape(double radius) {
		super();
		this.radius = radius;
	}
	
	
}
