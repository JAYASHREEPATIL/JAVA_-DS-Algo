import java.util.*;
public class MatrixAdditionExample{  
public static void main(String args[]){  
   
int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{12,30,41},{0,40,30},{10,20,40}};    
    
  
int c[][]=new int[3][3]; 
    

for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    
System.out.print(c[i][j]+" ");    
}    
System.out.println();   
}    
}}  