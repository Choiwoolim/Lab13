package edu.handong.csee.java.lab13.prob6;			//package name

public class Prob6 {								//prob6 is main class.

	public static void main(String[] args) {		//Create the main method	
		// TODO Auto-generated method stub
		UpPoint p1 = new UpPoint(3,3);				//instantiate the Uppoint p1. and assign 3,3
		DownPoint p2 = new DownPoint(2,5);			//instantiate the DownPoint p2, and assign 2,5
		DownPoint p3 = new DownPoint(4,7);			//instantiate the DownPoint p3, and assign 4,7
		UpPoint p4 = new UpPoint(9,12);				//instantiate the Uppoint p4, and assign 9,12

		Printer.print(p1);				//Call Printer method of p1
		Printer.print(p2);				//Call Printer method of p2
		Printer.print(p3);				//Call Printer method of p3
		Printer.print(p4);				//Call Printer method of p4

	}

}
