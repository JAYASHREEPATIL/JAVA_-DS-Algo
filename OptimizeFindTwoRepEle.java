import java.util.*;

public class OptimizeFindTwoRepEle
{
	public static void main(String args[])
	{
		int arr[] = {4,6,2,4,0,9,2,3};
	
	Set<Integer> s = new HashSet<Integer>();
	for(Integer element:arr)
	{
		if(s.contains(element))
		{
			System.out.println(element);
		}
		else
		{
			s.add(element);
		}
	}
	}
}