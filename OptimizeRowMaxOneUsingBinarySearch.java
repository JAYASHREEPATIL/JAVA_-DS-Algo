import java.util.*;

public class OptimizeRowMaxOneUsingBinarySearch
{
	public static void main(String args[])
	{
		int mat[][]={
						{0,0,0,1,1},
						{0,0,1,1,1},
						{0,0,0,0,0},
						{0,1,1,1,1},
						{0,0,0,0,1}
					  };
		System.out.println("Index of rows with maximum 1s is "+rowWithMax1s(mat));
	}
}