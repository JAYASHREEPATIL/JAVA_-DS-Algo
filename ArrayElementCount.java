import java.util.*;

public class ArrayElementCount
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n = in.nextInt();
		int arr[] = new int[n];
		//System.out.println("Enter Element in array :");
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.println("Enter Element for count no of time occurance: ");
		int element = in.nextInt();
		int count =0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] == element)
			{
				count++;
			}
		}
		System.out.println(element+" occurance in array is :"+count);
	}
	
}