import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDupCharInString {
public static void main(String args[])
{
	String str = "JayaJ";
	LinkedHashSet<Character> lhs = new LinkedHashSet<>();
	
	for(int i=0;i<str.length();i++)
	{
		lhs.add(str.charAt(i));
	}
	
	for(char c:lhs)
	{
		System.out.print(c);
	}
	
	
	/*List<Character>list = new ArrayList<Character>();
	
	for(int i=0;i<str.length();i++)
	{
		if(list.contains(str.charAt(i)))
		{
			break;
		}
		else
		{
			list.add(str.charAt(i));
		}
	}
	for(Character c: list)
	{
		System.out.print(c);
	}*/
	
	
	}
}
