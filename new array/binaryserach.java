import java.util.*;
public class binaryserach {
    public static int searchbinary(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // comparisons
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,12,26};
        int key=55;
        System.out.println(searchbinary(array, key));
        
    }
}