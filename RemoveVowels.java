import java.util.*;
public class RemoveVowels
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String result = "";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' ||str.charAt(i)=='U' ||
				str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u')
				{
					continue;
				}	
				else
				{
					result = result+str.charAt(i);
				}
		}
		System.out.println(result);
	}
}