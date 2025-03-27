import java.util.*;
public class callbyvalue {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("the swapped value  is "+a);
        System.out.println("the swapped value is "+b);

    }// JAVA FOLLOWS CALL BY VALUE MODEL AND C++ FOLLOWS CALL BY REFRENCE MODEL

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        swap(num1, num2);
        
    }
}