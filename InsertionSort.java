import java.util.*;
public class InsertionSort
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
		for(int i=1;i<n;i++)
		{
			int j=i-1;
			int temp=0;
			int key=a[i];
			while(j>=0 && key<a[j])
			{
				temp =a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				j--;
			}
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