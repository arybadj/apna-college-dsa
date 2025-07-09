import java.util.*;
public class sum_of_n {
    public static int suming(int n){
        int sum=0;
        if(n==0){
            return n;
        }
        
        sum=n+suming(n-1);
        return sum;

    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(suming(n));
        
    }
}