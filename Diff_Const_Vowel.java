import java.util.*;

public class Diff_Const_Vowel
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input: ");
		char ch = in.next().charAt(0);
		String str=output(ch);
		System.out.print(str);
	}
	public static String output(char ch)
	{
		String s="";
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			s="Input letter is Vowel";
		}
		else
		{
			s="Input letter is Constant";
		}
		return s;
	}
}