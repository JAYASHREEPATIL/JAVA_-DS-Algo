
public class LargestSunConSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {2,3,4,5,7};
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		int min = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			for(int j=i;j<arr.length;j++)
			{
				sum = sum + arr[j];
				if(sum > min)
				{
					min = sum;
				}
			}	
		}
		System.out.println(min);


	}

}
