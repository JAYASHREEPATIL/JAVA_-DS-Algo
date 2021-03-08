import java.util.*;
public class StackCollection
{
	public static void main(String args[])
	{
		Stack <Integer> st = new Stack<>();
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		st.push(500);
		printStack(st);
		st.pop();
		System.out.println("\nAfter Pop: ");
		printStack(st);
		System.out.println("\nPeek element: "+st.peek());
	}
	public static void printStack(Stack<Integer> st)
	{
		Stack <Integer> temp = new Stack<>();
		while(st.empty()==false)
		{
			temp.push(st.peek());
			st.pop();
		}
		while(temp.empty()==false)
		{
			int t = temp.peek();
			System.out.print(t+" ");
			temp.pop();
			st.push(t);
		}
	}
}