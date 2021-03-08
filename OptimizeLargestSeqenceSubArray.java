import java.util.*;
import java.util.List;

public class OptimizeLargestSeqenceSubArray
{
	public static void main(String args[])
	{
		int arr[] = {1,3,8,14,4,10,2,11,4,5};
		
		HashSet<Integer> hash = new HashSet<>();
		int temp =0;
		int lenghtOfSeq= 0;
		
		for(int i:arr)
		{
			hash.add(i);
		}
		
		for(Integer value: arr)
		{
			if(!hash.contains(value-1))
			{
				temp = value;
				
				while(hash.contains(temp))
				{
					temp++;
				}
				
				if(lenghtOfSeq<(temp-value))
				{
					lenghtOfSeq = temp-value;
				}
			}
		}
		System.out.println(lenghtOfSeq);
	}
}
