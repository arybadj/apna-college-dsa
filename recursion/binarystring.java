import java.util.*;
public class binarystring {
    public static void fill(int n,int last_place,String str){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }
        
        fill(n-1, 0, str+"0");
        if(last_place==0){
            fill(n-1, last_place, str+"1");
        }
        
    }

    public static void main(String[] args) {
        fill(5,0,"");
        
    }
}