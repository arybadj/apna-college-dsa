import java.util.*;
public class reverse_array {
    public static void rev(int arr[]){
        int start=0;int end=arr.length-1;
        int mid=(start+end)/2;
        int a=0;
        while(start<=mid){
            a=arr[start];
            arr[start]=arr[end];
            arr[end]=a;
            start++;
            end--;
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,45,56,87,99,999,9999};
        rev(arr);
        
    }
}