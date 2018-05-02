package edu.handong.csee.java.lab13.prob2;

public class Book {
	private static int idCount = 0;
	private String BookName;
	private int id;
	public Book ( String Name)
	{
		this.BookName = Name;
		idCount++;
		id = idCount;	
	}
	
	public String toString()
	{
		return "\n\tId: " + id + "\n\tBook Name: " + BookName;
	}
	
	public void show()
	{
		System.out.println("<<<BOOK>>>" + this.toString());
	}

}
