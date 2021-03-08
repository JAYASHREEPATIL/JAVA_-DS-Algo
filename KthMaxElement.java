import java.util.*;

public class KthMaxElement
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size:");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.print("Enter Element:");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.print("Enter Kth :");
		int result=kthSmall(arr,n,k);
		System.out.print("Kth Small ELement is : "+result);
	}
	public static int kthSmall(int a[],int n,int k)
	{
		int arr[]=new int[k];
		int x=0;
		while(x<k)
		{
			
		}
	}
}