import java.util.ArrayList;
import java.util.List;

public class SubArraySumTryArray {

	public static void main(String[] args) {
		// TODO Auto- method stub
		int arr[] = {3,4,-1,4,3,-6,-7,2};
		int sum=0;
		int k=6;
		boolean found=false;
		List<Integer>list = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			list.add(sum);
			sum = sum+arr[i];
			if(list.contains(sum-k))
			{
				found=true;
				break;
			}
		}
		if(found==true)
			System.out.print("Found");
		else
			System.out.print("Not Found");
		
	}

}
