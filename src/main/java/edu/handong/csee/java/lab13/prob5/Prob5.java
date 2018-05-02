package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;

public class Prob5 {
	public static boolean equals(int[][] n1, int[][]n2) {
		int count = 0;
		if(n1.length != n2.length)
			return false;
		for(int i=0;i<n1.length;i++) {
			for(int j =0; j<n2.length; j++) {
				if(n1[i][j] != n2[i][j])
					count++;
			}
		}
		if ( count<= 3)
			return true;
		else
			return false;
	}


	public static void main(String[] args) {
		int n1, n2 = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter row size(maximum 5) : ");
		n1 = keyboard.nextInt();

		System.out.print("Enter column size(maximum 5) : ");
		n2 = keyboard.nextInt();

		int[][] a = new int[n1][n2];

		System.out.print("Enter row size(maximum 5) : ");
		n1 = keyboard.nextInt();

		System.out.print("Enter column size(maximum 5) : ");
		n2 = keyboard.nextInt();

		int[][] b = new int[n1][n2];

		System.out.print("Enter List1 : ");
		for(int i =0; i<a.length; i++) {
			for(int j =0; j<a[i].length;j++) {
				a[i][j] = keyboard.nextInt();
			}
		}

		System.out.print("Enter List2 : ");
		for(int i =0; i<b.length; i++) {
			for(int j =0; j<b[i].length;j++) {
				b[i][j] = keyboard.nextInt();
			}
		}

		for(int i=0; i<a.length; i++) {
			for(int j =0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		for(int i=0; i<b.length; i++) {
			for(int j =0; j<b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		if(equals(a,b))
			System.out.println("The two arrays are approxmately identical.");
		else
			System.out.println("The two arrays are not identical");

	}
}