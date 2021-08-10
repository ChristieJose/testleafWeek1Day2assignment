package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] arr= {3,2,11,4,6,7};
		Arrays.sort(arr);//sorting array
		System.out.println("sorted array");
		for(int i=0; i<arr.length;i++)//looping
		{
			System.out.println("arr[" + i + "]="+arr[i]);
		}
		{
			System.out.println("second largest element = " +arr[arr.length-2] );//find second largest
		}
	}
}


