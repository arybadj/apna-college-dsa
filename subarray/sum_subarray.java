import java.util.*;
public class sum_subarray {
    public static void traverse(int array[]){
        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int q=i;q<=j;q++){
                    sum=sum+array[q];
                
                }System.out.println(sum);
                sum=0;
            }
        }
    }
// this is not optimal as the time complexcity is very high it is of O(n^3) it is good for learning but not good for optimal results
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        traverse(arr);
        
    }
}