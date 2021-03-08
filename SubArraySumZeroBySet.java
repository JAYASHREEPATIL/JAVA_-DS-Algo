import java.util.*;

public class SubArraySumZeroBySet
{
	public static void main(String args[])
	{
		int arr[] = {3,4,-1,4,3,-6,-7,2};
		int sum =0;
		int k=6;
		boolean found=false;
		
		Set<Integer> set = new HashSet<>();
		for(int element : arr)
		{
			set.add(sum);
			sum += element;
			
			if(set.contains(sum-k))
			{
				found = true;
				break;
			}
		}
		
		if(found == true)
			System.out.println("found");
		else
			System.out.println("not found");
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
