import java.util.*;
public class ReverseArray
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
		System.out.println("Reversed Array: ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}