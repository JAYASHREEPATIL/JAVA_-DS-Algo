import java.util.*;

public class MaxProductSubArray
{
	public static void main(String args[])
	{
		//int arr[] = {6,-3,-10,0,2};
		int arr[] = {-1,-3,-10,0,60};
		int min = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			int product =1;
			for(int j=i;j<arr.length;j++)
			{
				product = product*arr[j];
				if(product>min)
				{
					min = product;
				}
				System.out.println(min);
			}			
		}
		System.out.println(min);
	}
}