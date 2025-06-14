import java.util.*;
public class whileloop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int sum=0;
        while(i<11){
            
            i++;
            sum=sum+i;
            
            
        }
    System.out.println(sum);
    }
}