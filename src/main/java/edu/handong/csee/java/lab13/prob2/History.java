package edu.handong.csee.java.lab13.prob2;							//Package name

public class History extends Book {									//Class name is History. history class extends Book.(Polymorphism).
	private String Author;											//Declare the String variable Author.
	
	public History(String Name, String Author) {					//Create the History method.
		super(Name);												//super apply the name.
		this.Author = Author;										//Assign the author.
	}
	
	public String toString() {										//Create the toString()method. this method store the return value.
		return super.toString() + "\n\tAuthor: " + Author;			//Store the next string value(Id: (number)        Book Name: (BookName)     Author : (Author)
	}
	
	public void show() {											//Create the show()mehtod, this method print the following sentence
		System.out.println("<<<History>>>" + this.toString());		//print the following sentence include toString()method
	}


}
