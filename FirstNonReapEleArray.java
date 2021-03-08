import java.util.*;
import java.util.List;

public class FirstNonReapEleArray
{
	public static void main(String args[])
	{
		int arr[] = {5, 3, 0, 3, 5, 6};
		int search = 0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			search = arr[i];
			int j=0;
			for(j=0;j<arr.length;j++)
			{
				if(i != j && search == arr[j])
				{
					break;
				}
			}
			if(j == arr.length)
			{
				System.out.println(arr[i]);
				break;
			}
		}
			
	}
}