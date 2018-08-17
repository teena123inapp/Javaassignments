package com.inapp.firstjava.test;
import com.inapp.firstjava.util.*;


public class TestTeachers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arrayLength = 5;
		
		Teacher squareArr[] = new Teacher[arrayLength]; 
		
		String fruits[] = {"Apple","Orange","Mango","Pappaya","Jack Fruit"};
		
		Teacher teach1=new Teacher();
		Teacher teach2 =  new Teacher(400,7000);		
		for(int i=0;i<arrayLength;i++){
			squareArr[i] = teach1;
		}
		
		for(int i=0;i<fruits.length;i++){
			System.out.println("element in "+i+" is :"+fruits[i]);
		}
		teach2.setBasicSalary(8000);
	}

}
