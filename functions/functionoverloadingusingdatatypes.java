import java.util.*;
public class functionoverloadingusingparamter {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        int c=sum(5,7,8,9);
        System.out.println(c);
        
    }
}