import java.util.*;
public class PermutationOfString
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter String:");
		String str = in.next();
		permutation(str,"");
	}
	public static void permutation(String str, String ans)
	{
		if(str.length()==0)
			{
				System.out.print(ans+" ");
				return;
			}
		for(int i=0;i<str.length();i++)
		{
			
			char ch = str.charAt(i);
			
			String lstring = str.substring(0,i);
			String rstring = str.substring(i+1);
			String ros = lstring+rstring;
			permutation(ros,ans+ch);
		}
	}
}