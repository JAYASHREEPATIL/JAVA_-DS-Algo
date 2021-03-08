import java.util.*;

public class SumOfPrimeNo
{
	public static void main(String args[])
	{
		int sum=0;
		int count=0;
		for(int num=1;num<=100;num++)
		{
			count=0;
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
				{
					count++;
					break;				
				}
			}
			if(count==0 && num!=1)
			{
				sum=sum+num;
			}		
		}
		System.out.println("Sum: "+sum);
	}
}