import java.util.*;

public class OptimizeMaxProductSubArray
{
	public static void main(String args[])
	{
		//int arr[] = {6,-3,-10,0,2};
		//int arr[] ={-1,6,2,0,7,9};
		//int arr[] = {-1,-3,-10,0,60};
		//int arr[] = {2,3,-2,4};
		int arr[] = {-2,0,-1};
		int max = arr[0];
		int product = 1;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(product==0)
			{
				product = arr[i];
			}
			else
			{
				product = product*arr[i];
			}
			
			max = Math.max(max,product);
		}
		System.out.println(max);
	}
}