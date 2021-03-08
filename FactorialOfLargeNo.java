import java.util.Scanner;

/**
 * 
 */

/**
 * @author shree
 *
 */
public class FactorialOfLargeNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter no: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q=2;
		int arr[]=new int[100000];
		int len=1;
		arr[0]=1;
		int num=0;
		int x=0;
		
		while(q <= n)
		{
			x=0;
			num=0;
			
			while(x<len)
			{
				arr[x]=arr[x]*q;
				arr[x]=arr[x]+num;
				num = arr[x]/10;
				arr[x]=arr[x]%10;
				x++;
			}
			while(num !=0 )
			{
				arr[len] = num%10;
				num = num/10;
				len++;
			}
			q++;
		}
		len--;
		while(len >= 0)
		{
			System.out.print(arr[len]);
			len=len-1;
			
		}
	}
}
