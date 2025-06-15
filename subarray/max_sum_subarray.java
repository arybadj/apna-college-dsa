import java.util.*;
public class max_sum_subarray {
    public static void traverse(int array[]){
        int sum=0;
        int max_num=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                
                for(int q=i;q<=j;q++){
                    sum+=array[q];
                
                }System.out.println(sum);
                if(sum>max_num){
                    max_num=sum;
                }sum=0;

                
            }
        }System.out.println("maximum subarray sum is "+max_num);
    }
// this is the brute force method which has very high time complexity
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,8};
        traverse(array);
        
    }
}