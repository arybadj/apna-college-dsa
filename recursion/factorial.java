import java.util.*;
public class factorial {
    public static int fact_num(int n){
        if(n==0){
            return 1;
        }
        int m=n*fact_num(n-1);
        return m;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(fact_num(n));
    }
}