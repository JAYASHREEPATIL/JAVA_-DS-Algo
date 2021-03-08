import java.util.*;
public class SelectionSort
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Element of Array");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		sort(a,n);
		printArray(a);
	}
	public static void sort(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int minInd=i;
			for(int j=i;j<n;j++)
			{
				if(a[j]<a[minInd])
				{
					minInd=j;
				}
			}
			int temp = a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
		}
	}
	public static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}