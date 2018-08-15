package com.inapp.firstjava.learn;

public class Rectangle {
	
	private double length;
	private double breadth;
	private double perimeter;
	private double area;
	
	public Rectangle(){
		
	}
	public Rectangle(double length,double breadth)
{
     this.length=length;
     this.breadth=breadth;
     perimeter=2*(length+breadth);
     area=length*breadth;
}

	
	public void setLength(double length) {
		this.length = length;
		perimeter=2*(length+breadth);
		area=length*breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
		perimeter=2*(length+breadth);
		area=length*breadth;
	}
	public double getLength() {
		return length;
	}
	public double getBreadth() {
		return breadth;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public double getArea() {
		return area;
	}
	
	

	
}
