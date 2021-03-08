import java.util.*;

public class ArrayMinMax
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array..");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		min(arr);
		max(arr);
		
	}
	public static void min(int arr[])
		{
			int min= arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(min > arr[i])
				{
					min  = arr[i];
				}
			}
			System.out.println("Minimum element : "+min);
		}
	public static void max(int arr[])
		{
			int max= arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(max < arr[i])
				{
					max  = arr[i];
				}
			}
			System.out.println("Maximun element : "+max);
		}
}