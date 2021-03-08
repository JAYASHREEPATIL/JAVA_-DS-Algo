import java.util.*;

public class LCM{
	public static void main(String args[]){
	int arr[] = {5,10,20};
		int ax = arr[0];
    for(int i=1;i<arr.length;i++){
        ax = lcm(ax, arr[i]);
    }
    System.out.println("LCM : "+ax);
	}
	 public static int gcd(int x,int y){
        if(y == 0)
            return x;
        return gcd(y, x%y);
    }
    public static int lcm(int x,int y){
        return (x * y)/gcd(x, y);
    }
}