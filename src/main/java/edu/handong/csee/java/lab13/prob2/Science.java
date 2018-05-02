package edu.handong.csee.java.lab13.prob2;										//Package name

public class Science extends Book {												//Class name is Science. Science class extends Book.(Polymorphism).
	private String publisher;													//Declare the String variable publisher.

	public Science(String Name, String Publisher) {								//Create the Science method.
		super(Name);															//super applies the name.
		this.publisher = Publisher;												//Assign the publisher.
	}

	public String toString() {													//Create toString ()method. this method store the return value
		return super.toString() + "\n\tPublisher: " + publisher;				//Store the next string value( toString() and Publisher : publisher
	}

	public void show() {														//Create the show()mehtod, this method print the following sentence
		System.out.println("<<<Science>>>" + this.toString());					//print the following sentence include toString()method.
	}

}
