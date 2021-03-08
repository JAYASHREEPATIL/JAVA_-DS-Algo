import java.util.*;
public class TwoDimentionArray
{
	public static void main(String args[])
	{
		int [][]arr = new int[3][2];
		int count=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j] = 0;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.print("\n");
		}
	}
}