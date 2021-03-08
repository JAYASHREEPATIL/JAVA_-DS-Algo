import java.util.*;
import java.util.List;

public class ArrayUnion{

public static void main(String args[])
{
	int arr1[] = {1,2,3,4,5,6};
	int arr2[] = {4,8,9,10,11,12};

	List <Integer>list = new ArrayList<>();
	int search =0;
	
	
	for(int i=0;i<arr1.length;i++)
	{
		list.add(arr1[i]);
	}
	for(int i=0;i<arr2.length;i++)
	{
		search = arr2[i];
		for(int j=0;j<list.size();j++)
		{
			if(list.contains(search))
			{
				break;
			}
			else
			{
				list.add(search);
			}
		}
	}
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
}
}