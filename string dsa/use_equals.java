import java.util.*;
public class use_equals {

    public static void main(String[] args){
        String s1="tenny";
        String s2="tenny";
        String s3=new String("tenny");
        if(s1==s2){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        if(s1.equals(s3)){
        System.out.println("yes");
    }else{
        System.out.println("false");
    }
    }
}