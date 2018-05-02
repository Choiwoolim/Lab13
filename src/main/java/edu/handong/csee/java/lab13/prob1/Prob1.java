package edu.handong.csee.java.lab13.prob1;					//Package name.

public class Prob1 {										//Class name is Prob1. This class will be main class.

	public static void main(String[] args) {				//Declare the main method.
		// TODO Auto-generated method stub			
		Friend friend1 = new Friend();						//Make friend(JustFriend)
		SchoolFriend friend2 = new SchoolFriend();			//Make SchoolFreind(SchoolFriend)
		ClassFriend friend3 = new ClassFriend();			//Make ClassFriend(ClassFriend)
		
		InstanceOf.WhatFriend(friend1);						//Call InstanceOf class!! (for friend1)
		InstanceOf.WhatFriend(friend2);						//Call InstanceOf class!! (for friend2)
		InstanceOf.WhatFriend(friend3);						//Call InstanceOf class!! (for friend3)
		

	}

}
