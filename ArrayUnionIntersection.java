import java.util.*;
public class ArrayUnionIntersection
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n1 = in.nextInt();
		int arr1[] = new int[n1];
	
		System.out.println("Enter Element in array :");
		for(int i=0;i<n1;i++)
		{
			arr1[i] = in.nextInt();
		}
		
		System.out.println("Enter Size of second Array: ");
		int n2 = in.nextInt();
		int arr2[] = new int[n2];
		System.out.println("Enter Element in array :");
		for(int i=0;i<n2;i++)
		{
			arr2[i] = in.nextInt();
		}
		
		System.out.println("Sorted Array 1 : ");
		int temp1 = 0;
		for(int i=0;i<n1;i++)
		{
			for(int j=i+1;j<n1;j++){
				if(arr1[i] > arr1[j])
			{
				temp1 = arr1[i];
				arr1[i] = arr1[j];
				arr1[j] = temp1;
			}
			}
			
		}
		
		
		System.out.println("Sorted Array 2 : ");
		int temp2 = 0;
		for(int i=0;i<n2;i++)
		{
			for(int j=i+1;j<n2;j++){
				if(arr2[i] > arr2[j])
			{
				temp2 = arr2[i];
				arr2[i] = arr2[j];
				arr2[j] = temp2;
			}
			}
			
		}
		
		System.out.println("Matched Elements from two array : ");
		int match[] = new int[n1];
		int m=0,n=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					n = arr1[i];
					match[m] = n;
					m++;
				}
			}
		}
		for(int i=0;i<match.length;m++)
		{
			System.out.println(match[i]);
		}
		
	}
}