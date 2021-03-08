import java.util.*;
public class OptimizeBubbleSortPrac
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		bubbleSort(a,n);
	}
	public static void bubbleSort(int a[],int n)
	{
		boolean swap=false;
		int count_pass=0;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			swap=false;
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swap=true;
				}
			}
			count_pass++;
			if(swap==false)
			{
				break;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("Passes: "+count_pass);
	}
}