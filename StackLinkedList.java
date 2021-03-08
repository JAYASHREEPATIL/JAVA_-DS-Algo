import java.util.*;
public class StackLinkedList
{
	public static void main(String args[])
	{
		MyStack st = new MyStack();
		st.add(100);
		st.add(200);
		st.add(300);
		st.add(400);
		st.add(500);
		System.out.println();
		st.printStack();
		st.pop();
		st.pop();
		System.out.println();
		st.printStack();
		System.out.println("Peek element : "+st.peek());
		
	}
}
class MyStack
{
		Node head;
		static class Node{
			int data;
			Node next;
			public Node(int data)
			{
				this.data=data;
				next=null;
			}
		}
		public void add(int data)
		{
			Node addNode=new Node(data);
			if(isEmpty())
			{
				head=addNode;
				return;
			}
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=addNode;
		}
		boolean isEmpty()
		{
			return head==null;
		}
		public void pop()
		{
			Node temp=head;
			if(isEmpty())
			{
				System.out.print("Stack Empty can not remove");
			}
			if(temp.next==null)
			{
				Node toRemove=head;
				head=null;
				//return toRemove.data;
			}
			while(temp.next.next != null)
			{
				temp=temp.next;
			}
			Node toRemove=temp.next;
			temp.next=null;
			//return toRemove.data;
		}
		public int peek()
		{
			Node temp=head;
			if(isEmpty())
			{
				System.out.println("Stack Empty can not Peek");
			}
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			return temp.data;
		}
		public void printStack()
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
