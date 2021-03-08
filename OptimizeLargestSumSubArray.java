import java.util.*;

public class OptimizeLargestSumSubArray
{
	public static void main(String args[])
	{
		int arr[] = {2,3,4,5,7};
		int maxValue = arr[0];
		int sum = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(sum < 0)
			{
				sum = arr[i];
			}
			else
			{
				sum = sum+arr[i];
			}
			
			maxValue=Math.max(sum,maxValue);
		}
		System.out.println(maxValue);
	}
}