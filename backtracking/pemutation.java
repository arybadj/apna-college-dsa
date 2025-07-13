import java.util.*;
public class pemutation {
    public static void pnc(String arr,String ans ){
        if(arr.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<arr.length();i++){
            char curr=arr.charAt(i);
            //bacde=ba+de=bade skips c
            String newstr=arr.substring(0,i)+arr.substring(i+1);
            pnc(newstr, ans+curr);
        }
        
    }

    public static void main(String[] args) {

        pnc("abc", "");
        
    }
}