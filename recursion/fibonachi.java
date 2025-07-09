import java.util.*;
public class fibonachi {
    public static int fibonaccii(int n){
        if(n==1||n==0){
            return n;
        }
        
        
        int sum=fibonaccii(n-1)+fibonaccii(n-2);
        return sum;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonaccii(n));
        
    }
}