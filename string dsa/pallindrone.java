import java.util.*;
public class pallindrone {
    public static boolean pallind_str(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name="racecar";
        System.out.println(pallind_str(name));
        
    }
}