import java.util.*;
public class star {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        // int a=sc.nextInt();

        int sum=0;
        for(int i=1;i<b;i++){
            for(int n=1;n<=i;n++){
            System.out.print("*");
        }
        System.out.println();
    }
}}


