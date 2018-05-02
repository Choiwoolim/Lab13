package edu.handong.csee.java.lab13.prob3;				//Package name.

public class Circle extends Shape{						//Class name is Circle, Circle extends Shape class.
	private double radius;								//Declare the double variable radius.
	public Circle(double r) {							//Create the public method. method named is Circle.
		radius = r;										//radius assign r(input value).
	}

	public double area() {								//Create the area method. It can calculate the circle area
		return Math.PI * Math.pow(radius, 2);			//return value is double. and value is pi*(r^2)
	}

	public double perimeter() {							//Create the perimeter method. It can calculate the circle's perimeter
		return 2.0 * Math.PI * radius;					//return value is double. and value is 2*pi*r
	}

	public double get_Radius() {						//Create the get_Radius()method.
		return radius;									//return the radius.
	}

}
