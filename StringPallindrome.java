
public class StringPallindrome {
	public static void main(String args[])
	{
		String str = "aaaabbaaaa";
		boolean b=false;
		int i=0;
		int j=str.length()-1;
		
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				b=false;
			}
			else
			{
				b=true;
			}
			i++;
			j--;
		}
		if(b==true)
			System.out.println("String is Pallindrome");
		else
			System.out.println("String is not Pallindrome");

	}
}
