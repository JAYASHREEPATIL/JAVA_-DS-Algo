import java.util.HashSet;

public class LongestConsSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {1,3,8,14,4,10,2,11,4,5};
		int arr[] ={36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		//int arr[] ={1, 9, 3, 10, 4, 20, 2};
		
		HashSet<Integer> hash = new HashSet<>();
		int temp=0;
		int lengOfSeq=0;
		for(int i: arr)
		{
			hash.add(i);
		}
		
		for(Integer value: arr)
		{
			if(!hash.contains(value-1))
			{
				temp = value;
				while(hash.contains(temp))
				{
					temp++;
				}
				if(lengOfSeq<(temp-value)) 
				{
					lengOfSeq  = temp-value;
				}
			}
		}
		System.out.print(lengOfSeq);
	}

}
