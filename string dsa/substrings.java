import java.util.*;
public class substrings {
    public static void sub(String str,int start,int end ){
        String sub1="";
        for(int i=start;i<end;i++){
            sub1+=str.charAt(i);
            
        }
        System.out.println(sub1);
    }

    public static void main(String[] args) {
        String a="Aryash";
        sub(a, 0, 3);
        
    }
}