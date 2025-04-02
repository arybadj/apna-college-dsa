import java.util.*;
public class arguementsinarray {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+2;
        }
    }

    public static void main(String[] args) {
        //array works as by refrence and normally the function works in java as pass by value
        int mark[]={99,100,1};
        for(int i=0;i<mark.length;i++){
            System.out.println("this is my marks "+mark[i]);
        }
        update(mark);
        for(int i=0;i<mark.length;i++){
            System.out.println("this is my marks "+mark[i]);
        }
    }
}