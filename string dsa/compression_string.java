import java.util.*;
public class compression_string {
    public static void comp_str(String str){
        
        String newstr="";

        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }

            
        }
        System.out.println(newstr);
    }

    public static void main(String[] args) {
        String a="aaaaabbbbbcddd";
        comp_str(a);
    }
}