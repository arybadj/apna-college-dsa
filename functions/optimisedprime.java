import java.util.*;
public class optimisedprime {
    public static boolean isprime(int a){
        boolean isprime=true;
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                isprime=false;
                break;
            }
        
        }
        return isprime;
    }

    public static void main(String[] args) {
        System.out.println(isprime(12));
        
    }
}