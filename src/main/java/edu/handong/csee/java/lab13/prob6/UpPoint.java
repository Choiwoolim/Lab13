package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrintable {
	
	private int x, y;
	
	UpPoint(int x, int y){this.x = x; this.y = y;}
	
	public String toString() {
		return "x : " + x + " y : " + y;
	}
}
