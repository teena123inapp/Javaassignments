package com.inapp.firstjava.test;

public class Palindrome {
	
	public static void main(String args[]){
		String originalString="malayalam";
		String reversedString="";
		int length=originalString.length();
		for(int i=length-1;i>=0;i--){
			reversedString=reversedString+originalString.charAt(i);
		}
		if(originalString.equals(reversedString))
		{
			System.out.println("The string is Palindrome");
		}
		else
		{
			System.out.println("The string is not Palindrome");
		}
	}

}
