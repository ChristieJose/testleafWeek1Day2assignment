package week1.day2;

import java.util.Arrays;

public class Anagram {
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int lengthOfString1=text1.length();
		System.out.println("first string length is " + lengthOfString1 );
		int lengthOfString2=text2.length();
		System.out.println("Second string length is " + lengthOfString2);
		if(lengthOfString1==lengthOfString2)
		{
			System.out.println("the length of strings are equal");
		}

		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray1);
		
		{
		System.out.println(charArray1);
		}
		Arrays.sort(charArray2);
		{
			System.out.println(charArray2);
		}
		if(Arrays.equals(charArray1,charArray2))
			
		{
			System.out.println( "both are equal" );
		}
		else
		{
			System.out.println("not equal");
		}
}
}
