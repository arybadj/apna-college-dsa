import java.util.*;
public class find_first_occurance {
    public static int occur(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        
        if(key==arr[i]){
            return i;
        }
        return occur(arr, i+1, key);

    }

    public static void main(String[] args) {
        int arr[]={1,5,9,2,10,55,6};
        System.out.println(occur(arr, 0, 505));
        
    }
}