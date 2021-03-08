
public class SubSequenceOfString {
	public static void Supsequence_m(String input,String output)
	{
		if(input.length()==0)
		{
			System.out.println(output);
			return;
		}
		Supsequence_m(input.substring(1),output);
		Supsequence_m(input.substring(1),output+input.charAt(0));
	}
	public static void Supsequence(String input)
	{
		Supsequence_m(input,"");
	}
    public static void main(String[] args) 
    { 
    	String str="abc";
    	Supsequence(str);
    }
    
}

	


