import java.util.*;
public class LeaderInArrayOptimum
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size:");
		int n=in.nextInt();
		System.out.print("Enter element:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		leader(a,n);
	}
	public static void leader(int a[],int n)
	{
		ArrayList<Integer> list=new ArrayList<>();
		int max_from_right =  arr[n-1]; 
   
        /* Rightmost element is always leader */
        list.add(max_from_right); 
       
        for (int i = n-2; i >= 0; i--) 
        { 
            if (max_from_right <= arr[i]) 
            {            
            max_from_right = arr[i]; 
            list.add(max_from_right); 
            } 
        }  
        Collections.reverse(list);
        return list;
	}
}