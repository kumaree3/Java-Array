import java.util.Arrays;
public class Main {
public static void main(String[] args) {
int[] my_array = {
            10789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
System.out.println("Original numeric array : "+Arrays.toString(my_array));            
Arrays.sort(my_array);


System.out.println("Second largest value: " + my_array[my_array.length-2]);
}
}

Or

import java.util.Arrays;
public class Main {
public static void main(String[] args) {
int[] array = {
            10789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
            int temp;
System.out.println("Original numeric array : "+Arrays.toString(array));
int size = array.length; 
for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){

            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
}
System.out.println("Second largest value: " + array[array.length-2]);
}
}