import java.util.*;
public class whileloop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // // print 1 to n natural numberz
        // int i=1;
        // int n=sc.nextInt();
        // while(i<=n){
        //     System.out.println(i);
        //     i++;
        // }
        int i=1,sum=0;
        int n=sc.nextInt();
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);


    }
}