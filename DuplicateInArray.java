import java.util.*;

public class DuplicateInArray
{
	public static void main(String args[])
	{
		int arr[] = {2,3,4,2,4,0,9};
	int duplicate = 0;
	
	for(int i=0;i<arr.length;i++)
	{
		duplicate = arr[i];
		for(int j=i+1;j<arr.length;j++)
		{
			if(duplicate == arr[j])
			{
				
				System.out.println("Duplicate Element: "+duplicate);
			}
		}
		
	}
	}
	
	
}