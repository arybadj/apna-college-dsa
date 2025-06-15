import java.util.*;
public class kadan_algo {
    public static void kadanes(int array[]){
        int max_num=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<array.length;i++){
            curr_sum+=array[i];
            if(curr_sum<=0){
                curr_sum=0;
            }
            // if(max_num<curr_sum){
            //     max_num=curr_sum;
            // }
            max_num=Math.max(max_num, curr_sum);
        }System.out.println("current sum is "+curr_sum);
            System.out.println("maximun sum is "+max_num);
    }

    public static void main(String args[]){
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(array);


    }
}