import java.util.*;

public class FindTwoRepElement
{
	public static void main(String args[])
	{
		int arr[] = {4,6,2,4,0,9,2,3};
		int search=0;
		
		for(int i=0;i<arr.length;i++)
		{
			search = arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(search==arr[j])
				{
					System.out.println(search);
				}
			}
		}
	}
}