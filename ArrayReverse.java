import java.util.*;

public class ArrayReverse
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter Elements of Array : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.println("Reverse of Array: ");
		for(int i=(n-1);i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}