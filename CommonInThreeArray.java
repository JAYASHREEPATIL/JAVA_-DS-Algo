
public class CommonInThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {4,5,6,9,10,11};
		int arr3[] = {0,6,12,34,56,88};
		
		int comm_ele[]=new int[arr1.length+arr2.length+arr3.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			comm_ele[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<comm_ele.length;j++)
			{
				if(arr2[i]==comm_ele[j])
				{
					for(int k=0;k<arr3.length;k++)
					{
						if(arr2[i]==arr3[k])
						{
							System.out.print("Common Element is : "+arr3[k]);
						}
					}
				}
			}
		}
	}

}
