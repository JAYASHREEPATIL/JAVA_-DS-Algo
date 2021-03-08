import java.util.ArrayList;
import java.util.List;

public class SplitStringToZeroAndOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "0100110101";
		
		
		int count_0=0;
		int count_1=0;
		int final_count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='0')
			{
				count_0++;
			}
			else
			{
				count_1++;
				
			}
			if(count_0==count_1)
			{
				final_count++;
			}
			
		}
		System.out.println(final_count);
	}
}
