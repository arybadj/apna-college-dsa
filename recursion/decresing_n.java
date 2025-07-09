import java.util.*;
public class decresing_n {
    public static void decre_num(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        
        
        System.out.print(n+" ");
        decre_num(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        decre_num(n);
        
    }
}