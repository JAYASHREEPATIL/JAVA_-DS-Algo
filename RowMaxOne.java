import java.util.*;

public class RowMaxOne
{
	public static void main(String args[])
	{
		int arr[][] = {{0,1,1,0,0},{1,0,0,1,1},{1,1,1,1,1},{0,1,1,1,0},{0,0,0,1,1}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		
		int result = 0;
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j] == 1)
				{
					count++;
				}
				if(count>result)
				{
					result = count;
					k=i;
				}
			}
			
		}
		System.out.println(result+" "+k);
	}
}