package com.inapp.firstjava.test;

public class PlindromeWithReverse {
	public static void main(String args[]){
	    String original="malayalam";
		StringBuilder originalString=new StringBuilder(original);
		StringBuilder reversedString = new StringBuilder();
		reversedString=originalString.reverse();
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