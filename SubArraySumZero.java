import java.util.*;

public class SubArraySumZero
{
	public static void main(String args[])
	{
		int arr[] = {3,4,-1,4,3,-6,-7,2};
		int sum =0;
		boolean found=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;i++)
			{
				sum += arr[j];
				
				if(sum == 0)
				{
					found = true;
					break;
				}
			}
			if(found == true)
		    {
			System.out.println(found);
			break;
		   }
		}
		
		
	}
}