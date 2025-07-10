import java.util.*;
public class last_occurance {
    public static int occur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        
        int restIndex=occur(arr, key, i+1);
        if (restIndex != -1) {
        return restIndex; // Found key later → return that index
    }
        if(key==arr[i]){
            return i;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,5,9,2,10,55,6,55};
        System.out.println(occur(arr, 55, 0));
        
    }
}