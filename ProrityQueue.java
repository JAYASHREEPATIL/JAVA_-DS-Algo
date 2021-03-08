import java.util.*;
public class ProrityQueue
{
	public static void main(String args[])
	{
		PriorityQueue<Integer>pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(1);
		pq.add(100);
		pq.add(90);
		pq.add(88);
		pq.add(34);
		pq.add(1000);
		pq.add(55);
		pq.add(107);
		pq.add(2);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}
}