import java.util.*;
public class largest_string {
    public static void find_largest(String[] str){
        String largest=str[0];
        for(int i=1;i<str.length;i++){
            
            if((largest.compareTo(str[i]))<0){
                largest=str[i];
            }

            
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        String fruits[]={"apple","banana","grapes","z"};
        find_largest(fruits);
        
    }
}