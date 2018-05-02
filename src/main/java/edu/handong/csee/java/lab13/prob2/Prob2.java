package edu.handong.csee.java.lab13.prob2;									//Package name

public class Prob2 {														//Class name is Prob2. this class will be main class.
	public static void main(String[] args) {								//Create the main method.
		Book book = new Book("Simple Book");								//Assign the Book. book is instantiating book.
		Science science = new Science("Hello Physics!", "ScienceWorld");	//Assign the Science. Science is instantiating science.
		History history1 = new History("What Is history?", "E.H.Carr");		//Assign the History. History is instantiating history1
		
		book.show();														//book.show()mehtod is print the id, bookName
		science.show();														//Science show() method prints the id, bookname, publisher
		history1.show();													//history show() method prints the id, bookname, author.
	}

}
