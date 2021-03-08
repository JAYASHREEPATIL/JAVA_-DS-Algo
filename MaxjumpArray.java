import java.util.*;

public class MaxjumpArray
{
	public static void main(String args[])
	{
		int arr[] = {1,3,5,8,9,2,6,8,9};
		int output = jump(arr);
		System.out.println(output);
		int l = arr.length-1;
		System.out.println(l);
	}
	public static int jump(int arr[])
	{
		if(arr.length< -1)
			return 0;
		int ladder = arr[0];
		int stair = arr[0];
		int jump = 1;
		
		for(int level=1;level<arr.length;level++)
		{
			if(level == arr.length-1)
				return jump;
			if(level + arr[level] > ladder)
				ladder = level + arr[level];
			stair--;
			
			if(stair == 0)
			{
				jump++;
				stair = ladder-level;
			}
		}
		return jump;
	}
}