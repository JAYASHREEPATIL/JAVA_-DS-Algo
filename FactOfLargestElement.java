import java.util.*;

public class FactOfLargestElement
{
	public static void main(String args[])
	{
		//int arr[] = {1,2,4,5};
		
		long fact=1;
		int max =100;
		//int temp=0;
		
		/*for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}*/
		for(int i=1;i<=95;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}
}