import java.util.Scanner;

public class GFG {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		//int no_array = in.nextInt();
		//int l=0;
		  
		    int n=in.nextInt();
		    int arr[]=new int[n];
		    
		   
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=in.nextInt();
		    }
    	 int arr2[]=new int[n];
         int k=0;
         int diff=0;
         
         for(int i=0;i<n-1;i++)
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
