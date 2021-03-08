
public class FirstRepEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 5, 3, 4, 3, 5, 6};
		int search = 0;
		boolean flag = true;
		
		for(int i=0;i<arr.length;i++)
		{
			search = arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(search == arr[j])
				{
					flag = false;
					System.out.println(search+" is a first matched element ..");
				}
			}
			if(flag == false)
			{
				break;
			}
		}


	}

}
