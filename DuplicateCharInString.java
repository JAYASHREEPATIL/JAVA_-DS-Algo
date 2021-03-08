import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInString {
	public static void main(String args[]) {
	String str = "JavaJava";
	//System.out.println("Duplicate chracter is ");
	
	
	char ch[] = str.toCharArray();
	boolean f=false;
	int counter=0;
	int count[] = new int[256];
	for(int i=0;i<str.length();i++)
	{
		count[str.charAt(i)]++;
	}
	for(int i=0;i<count.length;i++)
	{
		if(count[i] > 1)
		{
			 System.out.printf("%c,  count = %d \n", i,  count[i]); 
		}
	}
	int a = 20;
	System.out.printf("%d", a);
}
	
		
	
}
	

