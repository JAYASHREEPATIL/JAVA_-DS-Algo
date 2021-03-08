import java.util.*;
public class MooshakProb
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size");
		int n=in.nextInt();
		int a[][]=new int[n][n];
		System.out.println("Enter Matrix: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		rateInMaze(a,4);
	}
	public static void rateInMaze(int a[][],int n)
	{
		int solution[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				solution[i][j]=0;
			}
		}
		mazeHelp(a,n,solution,0,0);
	}
	public static void mazeHelp(int a[][],int n,int solution[][],int x,int y)
	{
		if(x==n-1 && y==n-1)
		{
			solution[x][y]=1;
			printSolution(solution,n);
			return;
		}
		if(x>=n || x<0 || y>=n || y<0 || a[x][y]==0 || solution[x][y]==1)
		{
			return;
		}
		solution[x][y]=1;
		mazeHelp(a,n,solution,x-1,y);
		mazeHelp(a,n,solution,x+1,y);
		mazeHelp(a,n,solution,x,y-1);
		mazeHelp(a,n,solution,x,y+1);
		solution[x][y]=0;
	}
	public static void printSolution(int solution[][],int n)
	{
		System.out.println("\n Path : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(solution[i][j]+" ");
			}
			System.out.println();
		}
	}
}