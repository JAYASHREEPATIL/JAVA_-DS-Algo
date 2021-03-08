
public class FirstNonRepEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 3, 0, 3, 5, 6};
		
		for(int i=0;i<arr.length;i++)
		{
			int j=0;
			for(j=0;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j] && j!=i)
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
