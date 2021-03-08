import java.util.*;

public class GCDFromArrayIndex
{
	public static void main(String args[])
	{
		int arr[] = {2,4,6,8,16};
		
		int result=0;
		System.out.println("Enter index: ");
		Scanner in = new Scanner(System.in);
		int sindex = in.nextInt();
		int eindex = in.nextInt();
		
		for(int i=sindex;i<=eindex;i++)
		{
			result = GCD(result,arr[i]);
			
			if(result == 1)
			{
				System.out.println(1);
			}
		}
		
		
	
		System.out.println(result);
	}
	public static int GCD(int a,int b)
		{
			if(a==0)
				return b;
			return GCD(b%a,a);
		}
}