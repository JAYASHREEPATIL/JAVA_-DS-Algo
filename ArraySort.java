import java.util.*;

public class ArraySort
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
		System.out.println("Sorted Array: ");
		int temp = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++){
				if(arr[i] > arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}