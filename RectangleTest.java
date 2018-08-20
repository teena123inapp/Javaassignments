package com.inapp.firstjava.test;



import com.inapp.firstjava.util.Rectangle;

import com.inapp.firstjava.util.interfce.PolygonAreaCal;

public class RectangleTest {

	public static void main(String[] args) {
		RectangleTest calculatorTest = new RectangleTest();
		calculatorTest.testRectangle();
		//calculatorTest.testSquare();
	}
	
	public void testRectangle(){
		PolygonAreaCal rectangle  = new Rectangle(5,10.2);
		System.out.println("Area of rectangle : "+rectangle.calArea());
		//System.out.println("Perimeter of rectangle : "+rectangle.calculatePerimeter());
	}
	
/*	public void testSquare(){
	     calculatorService = new Square(6.5);
		System.out.println("Area of square : "+calculatorService.calculateArea());
	}*/

}
