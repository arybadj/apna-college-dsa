import java.util.*;
public class friends_problem_pairing {
    public static int friends(int n){
        if(n==1||n==2){
            return n;
        }
        return friends(n-1)+(n-1)*friends(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friends(4));
        
    }
}