import java.util.*;

public class EvenOddPlaces
{
	public static void main(String args[])
	{
		int no=5234;
		int rem=0;
		
		//System.out.println(no);
		
		/*if(no.length<=0)
		{
			if(no%2==0)
			{
				System.out.println("no "+no+" is even");
			}
			else
			{
				System.out.println("no "+no+" is odd");
			}
		}*/
		int count=0;
		while(no<0)
		{
			rem = no%10;
			if(rem%2==0)
			{
				count++;
			}
			no = no/10;
		}
		
		System.out.println("count even: "+count);
		/*System.out.println("Rem: "+rem);
		System.out.println("Div: "+no);*/
		
	}
}
