import java.util.*;
public class RoverControl
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int no=0;
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=no;
				no++;
			}
		}
		String []path = {"right","right","dowm","left","dowm","right","right","up","up","dowm"};
		int result = calculate(a,path,n);
		System.out.println(result);
	}
	public static int calculate(int a[][],String path[],int n)
	{
		int i=0;
		int j=0;
		for(int x=0;x<path.length;x++)
		{
			//String ch = path[x];
			/*switch(ch)
			{
				case "right":
				if(j<n)
				{
					j++;
				}
				break;
				case "left":
				if(j>=0)
				{
					j--;
				}
				break;
				case "up":
				if(j>=0)
				{
					i--;
				}
				break;
				case "dowm": 
				if(j>=0)
				{
					i++;
				}
				break;
			}*/
			
			String ch = path[x];
			if((ch=="right") && (j<n))
			{
				j++;
			}
			else if((ch=="left") &&(j>0))
			{
				j--;
			}
			else if((ch=="up") && (i>0))
			{
				i--;
			}
			else if((ch=="dowm") && (i<n))
			{
				i++;
			}
			
		}
		if(j>=n)
		{
			j=j-1;
		}
		if(i>=n)
		{
			i=i-1;
		}
		int r = a[i][j];
		return r;
	}
}