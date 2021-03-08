import java.util.*;
import java.util.List;

public class BinaryNum
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = in.nextInt();
		int rem;
		List<Integer>list = new ArrayList<Integer>();
		while(n>0)
		{
			rem=n%2;
			n=n/2;
			list.add(rem);
			//for(Integer i:list)
				
		}
		//System.out.print(list);
		
		 Integer[] arr = list.toArray(new Integer[0]);
			int l =arr.length;
			int count=0,sum=0;
		 for(int i=l-1;i>0;i--)
		 {
				sum = arr[i]+arr[i-1];
				if(sum == 2)
				{
					count++;
				}
				else{
					count = 1;
				}
			 System.out.print(arr[i]);
		 }
		 System.out.println();
		System.out.println("Count of consecutive 1: "+count);
	}
}