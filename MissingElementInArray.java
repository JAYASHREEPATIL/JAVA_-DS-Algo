
public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {19,20,21,22,23,25};
		int miss[] = new int[(arr.length)/2];
		int h=0;
		int min =0;
		int k=0;
		
		for(int i=0;i<(arr.length)-1;i++)
		{
			min = arr[i+1]-arr[i];
			if(min != 1)
			{
				k = arr[i];
				miss[h] = k+1; 
				h++;
			}
			
		}
		System.out.println("missing elements ....");
		for(int i=0;i<miss.length;i++)
		{
			System.out.println(miss[i]);
		}

	}

}
