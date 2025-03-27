import java.util.*;
public class binocoeff {
    public static double coeffi(int a,int b){
        int n=1;
        int p=1;
        int q=1;
        for(int i=1;i<=a;i++){
            n=i*n;
        }
        for(int j=1;j<=b;j++){
            p=p*j;

        }
        for(int e=1;e<=a-b;e++){
            q=e*q;

        }
        double bino=n/(p*q);
        return bino;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        double binomil_coefficient=coeffi(n, r);
        System.out.println(binomil_coefficient);
        
    }
}