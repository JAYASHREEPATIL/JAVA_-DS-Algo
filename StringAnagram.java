import java.util.*;
import java.util.Arrays;
import java.util.Collection;
public class StringAnagram
{
	public static void main(String args[])
	{
	String str1 = "abcd";
	String str2 = "cdab";
	boolean b=false;
	char ch[] = str1.toCharArray();
	char ch1[] = str2.toCharArray();
	
	Arrays.sort(ch);
	Arrays.sort(ch1);
	
	if((str1.length())==(str2.length()))
	{
		for(int i=0;i<str2.length();i++)
		{	
			
			if((ch[i])!=(ch1[i]))
			{
				b=false;
				
			}
			else
			{
				b=true;
			}
		}
		
	}
	else
	{
		b=false;
	}
	if(b==true)
		System.out.println("String is Anagram");
	else
		System.out.println("String is not Anagram");
	}
}