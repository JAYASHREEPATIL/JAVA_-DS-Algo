import java.util.*;

public class SwapFun
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
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
				swap(arr[mid],arr[low]);
				mid++;
				low++;
			}
			else if(arr[mid]==2)
			{
				swap(arr[mid],arr[high]);
				high--;
			}
			else
			{
				mid++;
			}
		}
	}
	public static void swap(int a, int b)
	{
		int temp=a;
		a=b;
		b=temp;
	}
	public static void print(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}	
	}
}