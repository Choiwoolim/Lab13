package edu.handong.csee.java.lab13.prob2;								//Package name

public class Book {														//Class name is Book, this class will store the book name and Print the name.
	private static int idCount = 0;										//Declare the integer variable idCount. idCount counts how many books.
	private String BookName;											//Declare the string variable BookName.
	private int id;														//Declare the integer variable id, id is print the book's number.	
	public Book ( String Name)											//Create the Book method.
	{
		this.BookName = Name;											//Assign the Bookname.
		idCount++;														//idCount = idCount + 1
		id = idCount;													//id equals idCounnt
	}
	
	public String toString()											//Create the toString()method. this method store the return value.
	{
		return "\n\tId: " + id + "\n\tBook Name: " + BookName;			//Store the next string value(Id: (number)        Book Name: (BookName) ) 
	}
	
	public void show()													//Create the show()mehtod, this method print the following sentence
	{
		System.out.println("<<<BOOK>>>" + this.toString());				//print following sentence <<<BOOK>>> (toString).
	}

}
