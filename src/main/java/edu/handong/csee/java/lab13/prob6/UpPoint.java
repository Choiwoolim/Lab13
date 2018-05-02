package edu.handong.csee.java.lab13.prob6;				//package name

public class UpPoint implements CapitalPrintable {		//Class name is UpPoint. It implements CapitalPrintable.

	private int x, y;									//Declare the integer variable x and y.

	UpPoint(int x, int y){this.x = x; this.y = y;}		//Instantiating UpPoint

	public String toString() {							//Create the method. this method will store the values.
		return "x : " + x + " y : " + y;				//store the following the sentence.
	}
}
