import java.util.Arrays; 
public class Main {
 
public static void main(String[] args) {
   int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   System.out.println("Original Array : "+Arrays.toString(array));     
   
   int j=0;
   int a=array.length;
   int new_array[] = new int[a+1];
   for(int i = 0; i < new_array.length; i++){
     if(array[i]==15){
        new_array[i] = array[i + 1];
        i=i+1;
     }
     else{
       new_array[i]= array[j];
       j++;
     }
      }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
    System.out.println("After removing the second element: "+Arrays.toString(array));
 }
 }