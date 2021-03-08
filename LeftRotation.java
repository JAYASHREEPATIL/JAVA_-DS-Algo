import java.util.*;

public class LeftRotation
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		
		int last = arr[(arr.length)-1];

		Scanner in =  new Scanner(System.in);
		System.out.println("Enter Rotate no : ");
		int k=in.nextInt();
		for(int j=1;j<=k;j++)
		{
			int first = arr[0];
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[(arr.length)-1] = first;
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}