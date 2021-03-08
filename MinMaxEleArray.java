import java.util.*;
public class MinMaxEleArray
{
	public static void main(String args[])
	{
		Scanner in  =  new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int n=in.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter element: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int min= minEle(arr,n);
		int max = maxEle(arr,n);
		System.out.println("Min element: "+min+" Maximum Element: "+max);
	}
	public static int minEle(int arr[],int n)
	{
		int result=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]<result)
			{
				result=arr[i];
			}
		}
		return result;
	}
	public static int maxEle(int arr[],int n)
	{
		int result=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>result)
			{
				result=arr[i];
			}
		}
		return result;
	}
}