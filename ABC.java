import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //int arr[]= {1,2,3,4,6};
     //int arr[]= {1, 2, 5,6,8};
		System.out.println("Enter size of Array ");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		int arr[]=new int[n];
		System.out.print("Enter element : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
     
    /* for(int i=0;i<arr.length-1;i++)
     {
    	 int a=arr[i+1]-arr[i];
    	 if(a>1)
    	 {
    		 System.out.print("Missing element: "+(arr[i]+1));
    	 }
    	 
     }*/
     int arr2[]=new int[arr.length];
     int k=0;
     int diff=0;
     
     for(int i=0;i<arr.length-1;i++)
     {
    	 diff=arr[i+1]-arr[i];
    	 if(diff>1)
    	 {
    		 for(int j=1;j<diff;j++)
    		 {
    			 arr2[k]=arr[i]+j;
    			 k++;
    		 }
    	 }
     }
    
     for(int i=0;i<k;i++)
     {
    	 System.out.print(arr2[i]);
     }
	}

}
