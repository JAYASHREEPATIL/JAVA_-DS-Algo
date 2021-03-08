import java.util.*;


public class LargestSumSubArray
{
	public static void main(String args[])
	{
		//int arr[] = {-2,-5,6,-2,-3,1,5,-6};
		int arr[] = {2,3,4,5,7};
		int min = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			for(int j=i;j<arr.length;j++)
			{
				sum = sum + arr[j];
				if(sum > min)
				{
					min = sum;
				}
			}	
		}
		System.out.println(min);
	}
	
}