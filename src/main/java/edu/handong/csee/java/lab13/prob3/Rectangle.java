package edu.handong.csee.java.lab13.prob3;			//package name

public class Rectangle extends Shape{				//This class name is Rectangle. Rectangle class extends Shape class.
	private double length;							//Declare the double type variable length.
	private double width;							//Declare the double type variable width.

	public Rectangle(double length, double width) {	//Create the rectangle method. it has length and width.
		this.length = length;						//Assign the length.
		this.width = width;							//Assign the width.
	}

	public double area() {							//area method can calculate the rectangle's area
		return length * width;						//width*length = area
	}

	public double perimeter() {						//perimeter method can calculate the rectangle's perimeter
		return 2*(length + width);					//(width + length) *2 = perimeter
	}

	public double get_Length() {					//get_Length method can get length.
		return length;								//get length.
	}

	public double get_Width() {						//get_width method can get width
		return width;								//get width.
	}

}
