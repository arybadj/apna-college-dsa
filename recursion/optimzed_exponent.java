import java.util.*;
public class optimzed_exponent {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int half_power=pow(x, n/2)*pow(x, n/2);
        if(n%2!=0){
            half_power*=x;
        }
        return half_power;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 10));
        
    }
}