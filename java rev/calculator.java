import java.util.*;
public class calculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        char operator=sc.next().charAt(0);
        int num2=sc.nextInt();
        

        switch (operator) {
            case '+': System.out.println(num1+num2);
                
                break;
            case '-': System.out.println(num1-num2);
                break;
            case '*': System.out.println(num1*num2);
                break;
            case '/': System.out.println(num1/num2);
        
            default:System.out.println("restart kro");

                break;
        }

    }
}