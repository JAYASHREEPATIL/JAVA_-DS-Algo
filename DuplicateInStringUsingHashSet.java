import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateInStringUsingHashSet {
  public static void main(String args[])
  {
	  String str = "JayaJava";
	  
	  System.out.println("  Duplicate : ");
	  duplicateFun(str);
  }
  public static void duplicateFun(String str)
  {
	char ch[] = str.toCharArray();
	
	Map<Character,Integer> dup = new HashMap<>();
	
	for(char c: ch)
	{
		if(dup.containsKey(c))
		{
			dup.put(c,dup.get(c)+1);
		}
		else
		{
			dup.put(c,1);
		}
	}
	Set<Character> keys = dup.keySet();  
	for(char c: keys)
	{
		if(dup.get(c)>1)
		{
			System.out.println(c+ "  is " + dup.get(c) + " times");  
		}
	}
	
  }
}
