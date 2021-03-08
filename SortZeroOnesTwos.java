import java.util.*;

public class SortZeroOnesTwos
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size:");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter element:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		sort(arr,n);
		print(arr,n);
		
	}
	public static void sort(int arr[],int n)
	{
		int low=0;
		int mid=0;
		int high=n-1;
		
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				swap(arr,mid,low);
				mid++;
				low++;
			}
			else if(arr[mid]==2)
			{
				swap(arr,mid,high);
				high--;
			}
			else
			{
				mid++;
			}
		}
	}
	public static void swap(int arr[],int a, int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void print(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}	
	}
}