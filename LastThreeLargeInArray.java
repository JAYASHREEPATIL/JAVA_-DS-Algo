import java.util.*;

public class LastThreeLargeInArray
{
	public static void main(String args[])
	{
		int arr[] = {10,1,5,6,9,34,0};
		int temp =0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=(arr.length)-1;i>(arr.length)-4;i--)
		{
			System.out.println(arr[i]);
		}
	}
}