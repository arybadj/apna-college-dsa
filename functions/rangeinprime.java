import java.util.*;
public class rangeinprime {
    public static boolean isprime(int a){
        if(a==2){
            return true;
        }else{
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        
        }
        return true;
    }}
    public static void inrange(int n){
        for(int i=2;i<=n;i++){
            // boolean a=isprime(i);
            if (isprime(i)){
                System.out.println(i+"");
            }
        // System.out.print();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        inrange(10);
        
    }
}