import java.util.*;

public class MinEleRotateSortArray
{
	public static void main(String args[])
	{
		//int arr[] = {3,4,5,1,2};
		int arr[] = {4,5,5,6,7,0,1,2};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i+1] >= arr[i])
			{
				continue;
			}
			else
			{
				System.out.println(arr[i+1]);
				break;
			}				
		}
	}
}