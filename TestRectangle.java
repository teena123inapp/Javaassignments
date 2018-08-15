package com.inapp.firstjava.test;

import com.inapp.firstjava.learn.*;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Rectangle rectangle1=new Rectangle();
         rectangle1.setLength(8);
         rectangle1.setBreadth(8);
         System.out.println(rectangle1.getArea());
         Rectangle rectangle2=new Rectangle(6,7);
         System.out.println("perimeter of the rectangle"+rectangle2.getPerimeter());
         rectangle2.setLength(7);
         System.out.println("perimeter of the rectangle**"+rectangle2.getPerimeter());
         
	}

}
