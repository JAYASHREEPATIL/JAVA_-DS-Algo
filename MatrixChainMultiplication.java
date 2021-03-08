import java.util.*;



public class MatrixChainMultiplication
{
	public static void main(String args[])
	{
		
		int arr[] = {5,4,6,2,7};
		int size = 5;
		MatrixChainMultiplication m = new MatrixChainMultiplication();
		
		System.out.println("Minimum number of matrix multiplications: "+(m.matOrder(arr, size)));

	}
	public int matOrder(int array[], int n)
{
	Integer myInf = Integer.MAX_VALUE;
	int minMul[][]=new int[n][n];
	
	for(int i=0;i<n;i++)
	{
		minMul[i][i] = 0; 
	}
	for (int length=2; length<n; length++)
	{
		for (int i=1; i<n-length+1; i++)
		{
			 int j = i+length-1;
			 minMul[i][j] = myInf;     //set to infinity
			for (int k=i; k<=j-1; k++) 
			{
            //store cost per multiplications
            int q = minMul[i][k] + minMul[k+1][j] + array[i- 1]*array[k]*array[j];
            if (q < minMul[i][j])
               minMul[i][j] = q;
			}
		}
	}
	return minMul[1][n-1];
}
}