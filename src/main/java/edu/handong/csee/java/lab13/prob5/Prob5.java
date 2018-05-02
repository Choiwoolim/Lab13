package edu.handong.csee.java.lab13.prob5;					//package name

import java.util.Scanner;									//using scanner

public class Prob5 {										//prob5 is main class
	public static boolean equals(int[][] n1, int[][]n2) {	//create the boolean type method
		int count = 0;										//Declare the integer type variable and initiating.
		if(n1.length != n2.length)							//n1's length is not equal to n2's length
			return false;									//this method can store false.
		for(int i=0;i<n1.length;i++) {						//loop the matirx's rowlength
			for(int j =0; j<n2.length; j++) {				//loop the matrix's columnlength
				if(n1[i][j] != n2[i][j])					//if matrix's each value is not same
					count++;								//count = count + 1
			}
		}
		if ( count<= 3)										//if count is less than 3
			return true;									//method can store true.
		else												//else condition
			return false;									//method can store false.
	}


	public static void main(String[] args) {				//Create the main method
		int n1, n2 = 0;										//declare the n1,n2 variable

		Scanner keyboard = new Scanner(System.in);			//using scanner
		System.out.print("Enter row size(maximum 5) : ");	//print the following sentence.
		n1 = keyboard.nextInt();							//assign row size is n1.

		System.out.print("Enter column size(maximum 5) : ");	//print the following sentence.
		n2 = keyboard.nextInt();							//assign column size is n2.

		int[][] a = new int[n1][n2];						//create the matrix a, it composed of row(n1),column(n2).

		System.out.print("Enter row size(maximum 5) : ");		//print the following sentence.
		n1 = keyboard.nextInt();							//reassign row size is n1.
			
		System.out.print("Enter column size(maximum 5) : ");		//print the following sentence.
		n2 = keyboard.nextInt();							//reassign column size is n2.

		int[][] b = new int[n1][n2];						//create the matrix b, it composed of row(n1), column(n2)

		System.out.print("Enter List1 : ");					//print the following sentence.
		for(int i =0; i<a.length; i++) {					//Loop the a's row component
			for(int j =0; j<a[i].length;j++) {				//Loop the a's column component
				a[i][j] = keyboard.nextInt();				//input the number
			}
		}

		System.out.print("Enter List2 : ");				//print the following sentence.
		for(int i =0; i<b.length; i++) {				//Loop b's row component
			for(int j =0; j<b[i].length;j++) {			//loop b's column component
				b[i][j] = keyboard.nextInt();			//input the number
			}
		}

		for(int i=0; i<a.length; i++) {					//loop the a's row
			for(int j =0; j<a[i].length; j++) {			//loop the a's column
				System.out.print(a[i][j] + " ");		//print the a's component
			}
			System.out.println();						//print enter.
		}
		System.out.println();		//print enter

		for(int i=0; i<b.length; i++) {					//loop the b's row
			for(int j =0; j<b[i].length; j++) {			//loop the b's column
				System.out.print(b[i][j] + " ");		//print the b's component
			}
			System.out.println();					//print enter.
		}
		System.out.println();					//print enter.

		if(equals(a,b))				//call equal method is true
			System.out.println("The two arrays are approxmately identical.");	//print the following sentence.	
		else	//else condition
			System.out.println("The two arrays are not identical");					//print the following sentence.

	}
}