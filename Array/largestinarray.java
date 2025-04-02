import java.util.*;
public class largestinarray {
    public static int check(int mark[]){
        int largest=Integer.MIN_VALUE;// - infinity
        for(int i=0;i<mark.length;i++){
            if(mark[i]>largest){
                largest=mark[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int marks[]={1,55,885,656,464,1235,111,5565};
        int a=check(marks);
        System.out.println(a);
        
    }
}