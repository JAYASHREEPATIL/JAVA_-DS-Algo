import java.util.*;

public class OptimizeTripletSum
{
	public static void main(String args[])
	{
		int arr[] = {1,2,0,3,1,2,4};
		int sum=0;
		int search=4;
		
		for(int i=0;i<arr.length;i++)
		{
			HashSet<Integer> s = new HashSet<>();
			for(int j=i+1;j<arr.length;j++)
			{
				int x = search - (arr[i]+arr[j]);
				
				if(s.contains(x))
				{
					System.out.println(arr[i]+" "+arr[j]+" "+x);
				}
				else
				{
					s.add(arr[j]);
				}
			}
		}
	}
}