package edu.handong.csee.java.lab13.prob6;				//package name

public class Printer {									//this class name is Printer. it's select the signal of alphabet.
	public static void print(Object object) {			//create the print method. 
		String str = object.toString();					//declare the string type variable. and assign
		if(object instanceof CapitalPrintable)			//Check the object's variable
			str= str.toUpperCase();						//assign the str is Uppercase.
		System.out.println(str);	 					//print the str's sentence.
	}

}
