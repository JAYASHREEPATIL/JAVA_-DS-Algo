import java.util.*;

public class StackDemo
{
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		Iterator<Integer> itr = stack.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next() +" ");
		}
		System.out.println();
		
		stack.pop();
		stack.push(5);
		itr = stack.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.print(itr.next() +" ");
		}
	}
}