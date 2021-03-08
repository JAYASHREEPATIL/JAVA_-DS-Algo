import java.util.*;

public class Comman_Digit
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		System.out.println("Result: "+result(n1,n2));
	}
	public static boolean result(int num1,int num2)
	{	
		
		int div1=num1/10;
		int rem1=num1%10;
		int div2=num2/10;
		int rem2=num2%10;
		
		return (div1==div2|| div1==rem2 || rem1== div2 || rem1==rem2);
		
			
		
	}
}