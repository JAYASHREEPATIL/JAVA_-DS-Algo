import java.util.Scanner;

public class ArrayCyclicRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of array :");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter Array Element: ");
		for(int i=0;i<n;i++)
		{
			arr[i] =in.nextInt(); 
		}

		System.out.print("Cylindrical Rotation of Array : ");
		int last = arr[(arr.length)-1];
		int first = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1] = arr[i];
		}
		arr[(arr.length)-1] = first;

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
        }

	}

}
