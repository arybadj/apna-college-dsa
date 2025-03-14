import java.util.*;
public class reversenum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0,a=0;
        while(n>0){

        num=n%10;
        System.out.print(num);

        n=n/10;
        // a=a+num*10;
        }
        System.out.println();
    }
}