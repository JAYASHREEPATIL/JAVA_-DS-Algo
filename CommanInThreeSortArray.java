import java.util.*;

public class CommanInThreeSortArray
{
	public static void main(String args[])
	{
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {4,5,6,9,10,11};
		int arr3[] = {0,6,12,34,56,88};
		
		int search=0;
		boolean flag=true;
		
		for(int i=0;i<arr1.length;i++)
		{
			search = arr1[i];
			
			for(int j=0;j<arr2.length;j++)
			{
				if(search == arr2[j])
				{
					for(int k=0;k<arr3.length;k++)
					{
						if(search == arr3[k])
						{
							System.out.println(search+" this element is common in all three Array...");
						
						}
					}
				}
			}
		}
	    		 
	}
}