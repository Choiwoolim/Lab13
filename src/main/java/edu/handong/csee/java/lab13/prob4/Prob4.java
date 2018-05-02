package edu.handong.csee.java.lab13.prob4;						//package name

import java.util.Scanner;										//using scan

public class Prob4 {											//prob4 class is main class

	public void feed(Pet pet) {									//public method of feed is print the pet's feed.
		System.out.println("feed : " + pet.food());	}			//print the following sentence.

	public static void main(String[] args) {					//create the main method
		// TODO Auto-generated method stub
		String cat_name, dog_name;								//Declare the string type 2 variable. they are dogname and catname

		Prob4 master = new Prob4();								//instantiate the prob4,
		Cat cat = new Cat();									//instantiate the cat
		Dog dog = new Dog();									//instantiate the dog

		Scanner keyboard = new Scanner(System.in);				//using scanner
		System.out.print("Enter the cat name and dog name : ");	//print the following sentence
		cat_name = keyboard.next();								//input string type is cat name.
		dog_name = keyboard.next();								//input string type is dog name.

		cat.setName(cat_name);									//set the cat name.
		cat.getName();											//get the cat name.
		master.feed(cat);										//print the cat's feed

		dog.setName(dog_name);									//set the dog name
		dog.getName();											//get the dog name
		master.feed(dog);										//print the dong's feed

	}

}
