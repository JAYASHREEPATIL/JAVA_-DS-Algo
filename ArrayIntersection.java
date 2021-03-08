import java.util.*;
import java.util.List;
public class ArrayIntersection
{
	public static void main(String args[])
	{
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {1,2,3,4,5,0};
		List<Integer> list = new ArrayList<>();
		//int match[];
		//int m=0,n=0;
		
		Scanner in = new Scanner(System.in);
		/*for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print(arr1[i]+" ");
				}
			}
		}*/
		for(int i=0;i<arr1.length;i++)
		{
			list.add(arr1[i]);
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println(arr2[j]);
				}
			}
		}
	
		/*for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}*/
	
	}  
}