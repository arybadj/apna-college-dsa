import java.util.*;


public class lowercase_vowels {
    public static void check(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char acc=str.charAt(i);
            if(acc=='a'||acc=='e'||acc=='i'||acc=='o'||acc=='u'){
                count++;
            }
            
        }



        System.out.println(count);



    }
    public static void main(String[] args) {
        String str="Aryash is my name and i will become great";
        check(str);
    }
    
}