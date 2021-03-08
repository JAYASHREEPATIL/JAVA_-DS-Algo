import java.util.*;
//package linkedList;
public class LinkedList
{
	public static void main(String args[])
	{
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.print();
		list.delete(40);
		//System.out.println(" delete:"+del);
		System.out.println();
		list.print();
	}
}
class MyLinkedList
{
	Node head;
	
	static class Node
	{
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
		if(isEmpty())
		{
			head=addNode;
			return;
		}
		Node temp = head;
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
	void print()
	{
		Node temp=head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	int delete(int data)
	{
		Node temp=head;
		while(temp.next.data != data)
		{
			temp=temp.next;
		}
		int r = temp.next.data;
		temp.next=temp.next.next;
		return r;
		
	}
}