import java.util.*;
public class factorial {
    public static int fact(int a){
        int n=1;
        for(int i=1;i<=a;i++){
            n=i*n;
        }
        return n;

    }

    public static void main(String[] args) {
        int val=fact(5);
        System.out.println(val);
    }
}