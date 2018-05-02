package edu.handong.csee.java.lab13.prob3;				//package name

public abstract class Shape {							//The class name is Shape.
	public abstract double area();						//area method can calculate the area
	public abstract double perimeter();					//perimeter method can calculate the perimeter
	public void display() {								//display() method is composed void type method. It can print them.
		System.out.println("Area : "+area()+ "\nPerimeter : " + perimeter() + "\n");	//print the followint sentence.
	}

}
