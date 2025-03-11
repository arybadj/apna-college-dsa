import java.util.*;
public class cond {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //  eligible to vote
        // int age=22;
        // if (age>18){
        //     System.out.println("eligible to vote");
        // }
        // else{
        //     System.out.println("not eligible");
        // }
        // which number is graeter
        // int a=1,b=3;
        // if(a<b){
        //     System.out.println("b is greater");
        // }
        // else{
        //     System.out.println("a is greater");
        // }
        // check weather the number is even or odd
        // int a=14;
        // if (a%2==0){
        //     System.out.println("number is even ");
        // }
        // else{
        //     System.out.println("number is odd");
        // }
        // using else if 
        // int age =14;
        // if (age <12){
        //     System.out.println("hello child");

        // }else if (age>=12 && age <18){
        //     System.out.println("hello teenageer");
        // }else{
        //     System.out.println("you are adult you have to pay tax");
        // }
        int income=sc.nextInt();
        double tax;
        if (income<500000){
            System.out.println("you have to pay no tax");
        }
        else if (income>500000 && income<100000){
            tax=(income-500000)*0.12;
            System.out.println(tax);
        }
        else{
            tax=(500000)*0.12+(income-1000000)*0.20;
            System.out.println(tax);
        }

    }
}
