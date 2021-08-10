package week1.day2;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {

		/*
		 * Pseudo Code
		 * 
		 * Declare String Input as Follow
		 * 
		 * String test = "changeme";
		 * 
		 * a) Convert the String to character array
		 * 
		 * b) Traverse through each character (using loop)
		 * 
		 * c)find the odd index within the loop (use mod operator)
		 * 
		 * d)within the loop, change the character to uppercase, if the index is odd
		 * else don't change
		 * 
		 */
		String test = "changeme";
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {  //looping
			if (i % 2  == 0) {                       //find odd index
				System.out.println(charArray[i]);

			} else 
			{
				System.out.println(Character.toUpperCase(charArray[i]));//string to uppercase

			}

		}
	}
}
