import java.util.*;
public class decimaltobinary {
    public static void conv(int n){
        int binar=0;
        // int lastdig=0;
        int counter=0;

        while(n>0){
            // lastdig=n%10;
            // binar=binar+(Math.)
            int lastdig=n%2;
            binar=binar+lastdig*(int)(Math.pow(10, counter));
            counter++;
            n=n/2;

        }
        System.out.println(binar);
    }

    public static void main(String[] args) {
        conv(5);
        
    }
}