import java.util.*;
public class BlockMaxProd
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter level:");
		int level = in.nextInt();
		int node = 2^(level)-1;
		int input[]=new int[node];
		System.out.print("Enter Tree: ");
		for(int m=0;m<node;m++)
		{
			input[m]=in.nextInt();
		}
		int a[][]=new int[level][node];
		int s=0;
		int put=node-1;
		int add=8;
		
		
		
		for(int i=0;i<level;i++)
		{
			put=put/2;
			for(int j=0;j<node;j++)
			{
				int temp=put;
				if(temp>node)
				{
					break;
				}
				if(j==put || j==temp)
				{
					a[i][j]=input[s];
					temp=temp+add;		
					s++;
				}
				else
				{
					a[i][j]=1;
				}
			}
			add=add/2;
		}
		for(int i=0;i<level;i++)
		{
			for(int j=0;j<node;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}