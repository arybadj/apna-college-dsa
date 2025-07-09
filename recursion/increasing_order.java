import java.util.*;
public class increasing_order {
    public static void inc_num(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        inc_num(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n=10;
        inc_num(n);
    }
}