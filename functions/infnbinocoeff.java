import java.util.*;
public class infnbinocoeff {
    public static int fact(int a){
        int n=1;
        for(int i=1;i<=a;i++){
            n=i*n;
        }
        return n;

    }
    public static double bino(int n,int r){
        int val=fact(n);
        int val1=fact(r);
        // int c=n-r;
        int val3=fact(n-r);
        int fin=val/(val1*val3);
        return fin;
        
    }

    public static void main(String[] args) {
        double a=bino(7,7);
        System.out.println(a);
        
    }
}