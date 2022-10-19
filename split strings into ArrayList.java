

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        String strin = "99,42,55,81,79,64,22";
        String str[] = strin.split(",");
        
        List nl = new ArrayList();
        nl = Arrays.asList(str);
        for(int i=0;i<str.length;i++){
            System.out.println(nl.get(i));
        }
    }
}