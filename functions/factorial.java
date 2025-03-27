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
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int val=fact(a);
        System.out.println("the value of the factorial is : "+val);
    }
}