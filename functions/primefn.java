import java.util.*;
public class primefn {
    public static void prime(int a){
        if(a==1){
            System.out.println("it is a unique number");
        }
        else if(a==2){
            System.out.println("it is a prime number");
        }
        else{
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("not prime");
                return;
            }
            
            }
            System.out.println("prime");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        prime(4);
        
    }
}
