import java.util.Scanner;
public class Main{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
    int x = a.length;
    int y = b.length;
//creating another matrix to store the sum of two matrices    
int c[][]=new int[x][y];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<x;i++){    
for(int j=0;j<y;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    
}}  