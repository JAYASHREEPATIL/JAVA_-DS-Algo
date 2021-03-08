import java.util.*;

public class TripletSum
{
	public static void main(String args[])
	{
		int arr[] = {1,2,0,3,1,2,4};
		int sum=0;
		int search=4;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					sum = arr[i]+arr[j]+arr[k];
					
					if(sum == search)
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}
}