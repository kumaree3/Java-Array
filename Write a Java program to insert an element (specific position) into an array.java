import java.util.Arrays; 
public class Main {
 
public static void main(String[] args) {
   int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   System.out.println("Original Array : "+Arrays.toString(array));     
   
   int j=0;
   int a=array.length;
   int new_array[] = new int[a+1];
   for(int i = 0; i < new_array.length; i++){
     if(i==1){
        new_array[i] = 12;
     }
     else{
       new_array[i]= array[j];
       j++;
     }
      }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
    System.out.println("After removing the second element: "+Arrays.toString(new_array));
 }
 }