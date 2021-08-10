package week1.day2;
import java.util.Arrays;
public class MissingElementArray {
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,7,6,8};
		Arrays.sort(arr);//sort 
		System.out.println("sorted array");
		for(int i=0; i<arr.length-1;i++)//looping
		{
			System.out.println("arr[" + i + "]="+arr[i]);
		}
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]!= i)//checking condition
			{
				System.out.println("missing: " +i);
				break;
			}
			}
	}
}
			
			
		
	

