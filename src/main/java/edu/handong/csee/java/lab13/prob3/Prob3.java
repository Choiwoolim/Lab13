package edu.handong.csee.java.lab13.prob3;				//Package name

import java.util.Scanner;								//Using the Scanner

public class Prob3 {									//This class is main class

	public static void main(String[] args) {			//Create the main method
		// TODO Auto-generated method stub

		double n1, n2;									//Declare the n1, n2 variable.(type double)
		Scanner keyboard = new Scanner(System.in);		//Call Scanner

		System.out.print("Enter radius: ");				//Print the following sentence
		n1 = keyboard.nextDouble();						//n1 is input double value.
		Circle c1 = new Circle(n1);						//Instantiate the c1. n1 is circle's radius

		System.out.println("Radius : " + c1.get_Radius());				//Print the circle's radius.
		c1.display();									//Print the area and perimeter

		System.out.print("Enter length and width : ");	//Print the following sentence
		n1 = keyboard.nextDouble();						//n1 is input double value.
		n2 = keyboard.nextDouble();						//n2 is input double value.
		Rectangle r1 = new Rectangle(n1, n2);			//r1 has n1 length, n2 width rectangle

		System.out.println("Length : " + r1.get_Length());		//Print the length
		System.out.println("Width : " + r1.get_Width());		//print the width
		r1.display();									//print the rectangle's area and perimeter.


	}

}
