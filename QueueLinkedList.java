import java.util.*;

public class QueueLinkedList
{
	public static void main(String args[])
	{
		MyQueue q  = new MyQueue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		System.out.println("Queue :");
		q.printQueue();
		System.out.println();
		System.out.println("Element Removed  : "+q.remove());
		System.out.println("Element Removed: "+q.remove());
		System.out.println("Queue :");
		System.out.println("Element : "+q.element());
	}
}
class MyQueue
{
	Node head,rear;
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
			Node addNode = new Node(data);
			if(head==null)
			{
				head=rear=addNode;
				return;
			}
			rear.next=addNode;
			rear=rear.next;
		}
		
		public int remove()
		{
			if(head==null)
			{
				return 0;
			}
			if(head==null)
			{
				rear=null;
			}
			Node temp = head;
			head = head.next;
			return temp.data;
			
		}
		public void printQueue()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		public int element()
		{
			//Node temp=head;
			return rear.data;
		}
}