import java.util.*;


	class Node
	{
		int data;
		Node left,right;
		
		Node(int data)
		{
			this.data = data;
			left = right=null;
		}
	}
public class BinarySearchTree
{
	public static Node insert(Node root, int data)
	{
		if(root == null)
		{
			return new Node(data);
		}
		else
		{
			Node cur;
			if(data<=root.data)
			{
				cur = insert(root.left,data);
				root.left = cur;	
			}
			else{
				cur = insert(root.right,data);
				root.right = cur;
			}
			
		}
return root;
	}
	public static int getHeight(Node root)
	{
		if(root == null)
		{
			return -1;
		}
		else
		{
			int lheight = getHeight(root.left);
			int rheight = getHeight(root.right);
			
			if(lheight>rheight)
			{
				return (1+lheight);
			}
			else
			{
				return(1+rheight);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of node want to add : ");
		int T = in.nextInt();
		 Node root = null;
		 
		 while(T --> 0)
		 {
			 int data = in.nextInt();
			 root = insert(root,data);
		 }
		 int height = getHeight(root);
		 System.out.println("Height of Tree : "+height);
	}
}