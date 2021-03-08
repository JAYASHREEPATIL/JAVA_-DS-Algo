import java.util.*;
import java.util.List;

public class MedianInRowSorted
{
	public static void main(String args[])
	{
		int arr[][] = {
			{1,3,4},
			{2,5,6},
			{7,8,9}
		};
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				list.add(arr[i][j]);
			}
		}
		
		Collections.sort(list);
		int n = list.size()/2;
		System.out.println("Median is : "+list.get(n));
	}
}