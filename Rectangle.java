package com.inapp.firstjava.util;

import com.inapp.firstjava.util.interfce.*;

public class Rectangle extends Polygon {
	
	private Double length;
	private Double breadth;
	private double area;
	private double perimeter;
	
	public Rectangle() {
		System.out.println("Constructor rectangle()");
	}
	
	public Rectangle(double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
		area = length * breadth;
		perimeter = 2*(length+breadth);
		System.out.println("Constructor rectangle(d,d)");
	}
		
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
		updateAreaAndPerimeter();
	}
	
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
		updateAreaAndPerimeter();
	}
	
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	
	private void updateAreaAndPerimeter(){
		area = length*breadth;
		perimeter = 2*(length+breadth);
	}
	public double calArea(){
		return length*breadth;
	}
	
}