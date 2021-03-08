import java.util.*;

public class SingalLinkList
{
	public class Node
	{
		int data;
		Node next;
	
		public Node(int data)
		{
			this.data = data;
			this.next = next;
		}
	}
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data)
	{
		Node newnode = new Node(data);
		
		if(head == null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			tail = newnode;
		}		
	}
	public void display()
	{
		Node current = head;
		
		if(head == null)
		{
			System.out.println("List is Empty!! ");
		}
		else
		{
			while(current != null)
			{
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		SingalLinkList list = new SingalLinkList();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		list.display();
	}
}