/**
 * Author- @RISHITA CHOUBEY

 * Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string, 
 * if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. 
 * For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 * The method should return true if the entered string is positive.
 */

package com.cg.Lab3;


public class Exercise8
{
	static boolean isPositiveString(String str)
	{
		str = str.toUpperCase();
		int size = str.length();
		int []arr = new int[size];
		char ch;
		for(int i = 0; i<size; i++)
		{
			ch = str.charAt(i);
			arr[i] = ch;
		}
		for(int i = 0; i<size-1; i++)
		{
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
		
	}
	public static void main(String[] args)
	{
		String input = "ANB";
		
		if(isPositiveString(input))
		{
			System.out.println("\""+input+"\" is a positive String");
		}
		else
		{
			System.out.println("\""+input+"\" is a not a positive String");
		}
		
	}
}
