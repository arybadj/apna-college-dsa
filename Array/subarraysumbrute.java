import java.util.*;
public class subarraysumbrute {
    public static void subarray(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    
                }ts++;
                System.out.println();
            }System.out.println();
        }
        System.out.println("total is  :"+ts);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,45};
        subarray(arr);

        
    }
}