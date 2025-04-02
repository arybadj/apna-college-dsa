import java.util.*;
public class arguementsinarray {
    public static void update(int marks[],int nonchangable){
        nonchangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+2;
        }
    }

    public static void main(String[] args) {
        //array works as by refrence and normally the function works in java as pass by value
        int mark[]={99,100,1};
        int nonchangable=546;
        for(int i=0;i<mark.length;i++){
            System.out.println("this is my marks "+mark[i]);
        }
        update(mark,nonchangable);
        for(int i=0;i<mark.length;i++){
            System.out.println("this is my marks "+mark[i]);
        }
        System.out.println(nonchangable);
    }
}