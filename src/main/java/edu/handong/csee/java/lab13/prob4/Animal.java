package edu.handong.csee.java.lab13.prob4;		//Package name

public class Animal {							//Class name is Animal.
	private String name;						//Declare the string type variable.
	public void setName(String name) {			//Create the setName method.
		this.name = name;						//assign the name
	}
	
	public void getName() {						//Create the getName method.
		System.out.println("Name : " + name);	//Print the name.
		
	}

}
