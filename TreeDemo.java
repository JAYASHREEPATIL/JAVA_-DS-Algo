import java.util.*;

public class TreeDemo
{
	public static void main(String args[])
	{
		TreeSet<String>ts  = new TreeSet<String>();
		ts.add("Zebra");
		ts.add("Monkey");
		ts.add("Buffallo");
		ts.add("Cat");
		
		Iterator<String> itr = ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}