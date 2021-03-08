import java.util.*;

public class DequeueLinkedList
{
	public static void main(String args[])
	{
		MyDeQueue q  = new MyDeQueue();
		q.addFirst(10);
		q.addFirst(20);
		q.addFirst(30);
		q.addLast(40);
		q.addFirst(50);
		q.addLast(60);
		q.addFirst(1000);
		q.addLast(140);
		System.out.println("DeQueue :");
		q.printQueue();
		System.out.println();
		System.out.println("Element Removed last : "+q.removeLast());
		System.out.println("Element Removed First : "+q.removeFirst());
		System.out.println("DeQueue :");
		System.out.println("Element : "+q.element());
	}
}
class MyDeQueue
{
	Node head,rear;
		static class Node{
			int data;
			Node next;
			Node prev;
			public Node(int data)
			{
				this.data=data;
				next=null;
				prev=null;
			}
		}
		public void addFirst(int data)
		{
			Node addf = new Node(data);
			if(head==null)
			{
				rear=head=addf;
				return;
			}
			head.prev=addf;
			addf.next = head;
			head=addf;
		}
		public void addLast(int data)
		{
			Node addl = new Node(data);
			if(head==null)
			{
				rear=head=addl;
				return;
			}
			
			addl.prev=rear;
			rear.next=addl;
			rear=addl;
		}
		
		public int removeFirst()
		{	
			if(head==null)
			{
				return 0;
			}
			Node temp=head;
			head=head.next;
			return temp.data;
		}
		public int removeLast()
		{	
			if(head==null)
			{
				return 0;
			}
			Node temp = rear;
			rear = rear.prev;
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