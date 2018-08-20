package com.inapp.firstjava.util;

public class Square extends Rectangle {
	public Square() {
		System.out.println("Constructor square()");
	}
	
	public Square(double sideLength) {
		super(sideLength,sideLength);		
		System.out.println("Constructor square(d,d)");
	}
}
