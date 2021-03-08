import java.util.*;
import java.util.Arrays;
import java.util.stream.*; 

public class RepeatedElem
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of Array:");
		int n=in.nextInt();
		System.out.print("Enter Element of Array:");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		repeatedElement(a,n);	
	}
	public static void repeatedElement(int a[],int n)
	{
		int count[] = new int[100];
		int max=n/2;
		for(int i=0;i<a.length;i++)
		{
			count[a[i]]++;
		}
		int result = Arrays.stream(count).max().getAsInt(); 
		if(result>=max)
		{
			System.out.println("Repeated Elem in Array: " +a[result]);
		}
        else
		{
			System.out.println("No Repeated Elem in Array");
		}
	}
}