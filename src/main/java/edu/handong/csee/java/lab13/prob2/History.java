package edu.handong.csee.java.lab13.prob2;

public class History extends Book {
	private String Author;
	
	public History(String Name, String Author) {
		super(Name);
		this.Author = Author;
	}
	
	public String toString() {
		return super.toString() + "\n\tAuthor: " + Author;
	}
	
	public void show() {
		System.out.println("<<<History>>>" + this.toString());
	}


}
