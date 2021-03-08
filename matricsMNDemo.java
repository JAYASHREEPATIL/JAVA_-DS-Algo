import java.util.*;

public class matricsMNDemo
{
	public static void main(String args[])
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of t 2D Array: ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int a[][] = new int[n1][n2];
		System.out.println("Enter Element for Array: ");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				a[i][j] = in.nextInt();
			}
		}
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}