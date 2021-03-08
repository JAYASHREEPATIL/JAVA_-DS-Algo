import java.util.*;
public class ArmstrongNo
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0;
		int no=n;
		while(n>0)
		{
			 int rem = n%10;
			 sum = (rem*rem*rem)+sum;
			 n = n/10;
		}
		System.out.println("Sum: "+sum);
		if(sum==no)
		{
			System.out.println("Number is ArmStrong");
		}
		else
		{
			System.out.println("Number is not ArmStrong");
		}
	}
}