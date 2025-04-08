import java.util.*;
public class binarysearch {
    public static int binu(int arr[],int key){
        int start=0;int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;


            if(arr[mid]==key){
                // System.out.println("element found");
                return mid;
            }else if (arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

            
        }return -1;
    }

    public static void main(String[] args) {
        int att[]={1,2,3,4,5,6,7,8,9,10,11,13,56};
        int key=71;
        int a=binu(att,key);
        System.out.println(a);
        
    }
}