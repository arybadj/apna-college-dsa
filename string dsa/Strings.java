import java.util.*;
public class Strings {

    // function that can create print string using charAt
    public static void str_char(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;// this is the one way for inititallizing the string
        // name="aryash";
        // System.out.println(name);
        // String nam=sc.next();  // this is the another way of stating string
        // System.out.println(nam);
        // String name1=sc.nextLine();// this is another way of inititialing the line
        // System.out.println(name1);

        // how to find the length of a string
        // System.out.println(name1.length());

        // concatenation in string
        String first_name="Aryash";
        // String second_name="Badjatya";
        // String Full_name=first_name+" " + second_name;
        // System.out.println(Full_name);
        

        // to print  a single letter in string what we will do we use this function

        System.out.println(first_name.charAt(0));
        str_char(first_name);
    }
}