package edu.handong.csee.java.lab13.prob2;

public class Science extends Book {
	private String publisher;
	
	public Science(String Name, String Publisher) {
		super(Name);
		this.publisher = Publisher;
	}
	
	public String toString() {
		return super.toString() + "\n\tPublisher: " + publisher;
	}
	
	public void show() {
		System.out.println("<<<Science>>>" + this.toString());
	}

}
