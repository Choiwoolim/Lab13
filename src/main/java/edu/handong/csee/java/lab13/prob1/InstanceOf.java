package edu.handong.csee.java.lab13.prob1;			//Package name.

public class InstanceOf {							//Class name is InstanceOf. This class find the friend type.
	public static void WhatFriend(Friend friend) 	//Declare the void type method What Friend.
	{
		if(friend instanceof ClassFriend)			//if friend is condition of Classfirend type
			((ClassFriend)friend).classFriend();	//CallClassFriend mehtod.
		else if(friend instanceof SchoolFriend)		//else if friend is condition of Schoolfriend type
			((SchoolFriend)friend).SchoolFriend();	//Call SchoolFriend method.
		else										//else condition
			friend.justFriend();					//Call JustFriend method.


	}

}
