import java.util.*;
public class productwithnum {
    public static int product(int a,int b){

        int c=a*b;
        return c;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mult=product(a, b);
        System.out.println("the product of the two number is  "+mult);
        
    }
}