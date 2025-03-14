import java.util.*;
public class except10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter the enw number");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }
    }
}