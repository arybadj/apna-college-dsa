import java.util.*;
public class largestinarray {
    public static int check(int mark[]){
        int largest=Integer.MIN_VALUE;// - infinity
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<mark.length;i++){
            if(mark[i]>largest){
                largest=mark[i];
            }
        }
        return largest;
    }
    public static int checksmall(int mark[]){
        int largest=Integer.MIN_VALUE;// - infinity
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<mark.length;i++){
            if(mark[i]<smallest){
                smallest=mark[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int marks[]={1,55,885,656,464,1235,111,5565};
        int a=check(marks);
        int b=checksmall(marks);
        System.out.println(a);
        System.out.println(b);
        
    }
}