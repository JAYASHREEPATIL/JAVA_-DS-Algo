import java.util.*;

public class EleMoreThanNByKTimes
{
	public static void main(String args[])
	{
		//int arr[] = {2,2,4,4,3,5,3,4,4,6,4,3,3,8};
		//int arr[] = {1,3,4,7,4,7,5};
		int arr[] = {1,1,1,1,2,2,3,3,4,4,5};
		int search=0;
		int n= arr.length;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value of k: ");
		int k=in.nextInt();
		System.out.print("Output: ");
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i: arr)
		{
			s.add(i);
		}
		
		for( Integer num : s)
		{
			int count=0;
			search = num;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==search)
				{
					count++;
				}
			}
			if(count > (n/k))
			{
				System.out.print(search+" ");
			}
		}
	}
}