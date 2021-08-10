
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (should match item in both arrays)
	 */


package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		int [] array1={3,2,11,4,6,7};
		int lengthArray1 = array1.length;
		System.out.println(" Length of  First array:" + lengthArray1);//create first array find length
	    for(int i=0; i<lengthArray1;i++)
	    {
	    	System.out.println("First array elements are: " + array1[i]);//display first array
	    }
	    int [] array2={1,2,8,4,9,7};
		int lengthArray2 = array2.length;////create second array find length
		{
			System.out.println(" Length of  Second array:" + lengthArray2);
		}
	    for(int j=0; j<lengthArray2;j++)
	    {
	    	System.out.println("Second array elements are: " + array2[j]);////display second  array
	    }
	    for(int i=0; i<lengthArray1;i++)
	    {
	    	for(int j=0; j<lengthArray2;j++)
		    {
	    	if (array1[i] == array2[j])//compare the values in the array
	    	{
	    			System.out.println(  array1[i] );//print the resuly
		    }
		    }
	    }
	}
}



	    
		
		