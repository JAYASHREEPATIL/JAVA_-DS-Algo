import java.util.*;

public class FindSumInArray
{
	public static void main(String args[])
	{
		int arr[] = {2,3,0,1,0,4,5,6};
		int sum=0;
		int sumElement =6;
		
		System.out.println("Elemets in Array : ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum = arr[i]+arr[j];
				if(sumElement == sum)
				{
					System.out.println(arr[i]+ " "+arr[j]+" ");
				}
			}
		}
	}
}