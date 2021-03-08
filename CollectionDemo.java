import java.util.*;

public class CollectionDemo
{
	public static void main(String args[])
	{
		int arr[] = new int[] {1,2,3,4};
		Vector<Integer> v = new Vector();
		Hashtable<Integer,String> h = new Hashtable();
		
		//adding element to vector
		v.addElement(1);
		v.addElement(2);
		
		//adding element to hashtable
		h.put(1,"geeks");
		h.put(2,"4geeks");
		
		//accesing element
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
	}
}