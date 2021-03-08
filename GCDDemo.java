import java.util.*;

public class GCDDemo
{
	public static void main(String args[])
	{
		int a =90;
		int b=34;
		int c=0;
		int max = 0;
		int result=0;
		if(a<b)
		{
			c=a;
		}
		else
		{
			c=b;
		}
		
		for(int i=1;i<=c;i++)
		{
			if((a%i==0) && (b%i==0) )
			{
			   result=i;
			   max = Math.max(max,result);
			}
		}
		int lcm = a/max * b/max * max;
		System.out.println(lcm);	
	}
}