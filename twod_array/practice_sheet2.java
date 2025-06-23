import java.util.*;
public class practice_sheet2 {

    //Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.
    //Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18
    

    

    public static void main(String[] args){
        int sum=0;
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        for(int i=0;i<nums.length;i++){
            sum+=nums[1][i];

        }
        System.out.println(sum);

    }
}