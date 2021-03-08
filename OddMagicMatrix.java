import java.util.*;
public class OddMagicMatrix
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n*n];
		for(int i=0;i<=n*n;i++)
		{
				a[i]=in.nextInt();
		}
		gererate(a,n);
	}
	public static void gererate(int arr[],int n)
	{
		int x;
		int a[][]=new int[n][n];
		int row=0;
		int col=n/2;
		for(x=0;x<=n*n;x++)
		{
			a[row][col]=arr[x];
			
			if(arr[x]%3==0)
			{
				row++;
			}
			else
			{
				row--;
				col--;
				if(row<0)
				{
					row=row+n;
				}
				if(col<0)
				{
					col=col+n;
				}
			}
		}
		print(a,n);
	}
	public static void print(int a[][],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}