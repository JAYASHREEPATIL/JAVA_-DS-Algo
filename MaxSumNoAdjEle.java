import java.util.*;
public class MaxSumNoAdjEle
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int include = a[0];
		int exclude = 0;
		
		for(int i=1;i<n;i++)
		{
			int new_include = exclude+a[i];
			int new_exclude = Math.max(include,exclude);
			
			include=new_include;
			exclude=new_exclude;
		}
		
		int ans = Math.max(include,exclude);
		System.out.println("Solution: "+ans);
	}
	
}