package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		String str="madam";
		String rev ="";
		int lengthStr = str.length();//string length
		System.out.println("string length is :" + lengthStr);
		for(int i=lengthStr-1;i>=0;i--)//looping
		{
			rev=rev+str.charAt(i);//find reverse
		}
		 if (str.equals(rev))
		 {
	         System.out.println("Entered string is a palindrome."); 
		 }
		 
	      else  
	      {
	         System.out.println("Entered string isn't a palindrome."); 
	      }
				
	}

}
