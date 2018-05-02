package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape{
	private double radius;
	public Circle(double r) {
		radius = r;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double perimeter() {
		return 2.0 * Math.PI * radius;
	}
	
	public double get_Radius() {
		return radius;
	}

}
