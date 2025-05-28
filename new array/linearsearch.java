import java.util.*;
public class linearsearch {
    public static int linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if (num[i]==key){
                return i;
            }
            
        }System.out.println("not found elemtn");
        return -1;
    }

    public static void main(String[] args) {
        int marks[]={1,2,3,4,5,66,89,650,1234,2356};
        int key=123;
        int a=linear(marks, key);
        System.out.println(a);
    }
}