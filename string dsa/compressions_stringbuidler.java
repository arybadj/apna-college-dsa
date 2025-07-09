import java.util.*;
public class compressions_stringbuidler {
    public static void comp_str(String str){
        StringBuilder a=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            a.append(str.charAt(i));
            if(count>1){
                a.append(count.toString());
            }
        }



        System.out.println(a);






    }

    public static void main(String[] args) {
        String str="aaaabbbcdddeee";
        comp_str(str);
        
    }
}