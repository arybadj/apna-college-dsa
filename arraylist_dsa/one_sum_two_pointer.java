import java.util.*;
public class one_sum_two_pointer {
    public static void find(ArrayList <Integer> arr,int target){
        int lp=0;int rp=arr.size()-1;
        int sum=0;
        while(lp<rp){
            sum=arr.get(lp)+arr.get(rp);
            if(sum==target){
                System.out.println("found lp ="+lp+" rp ="+rp);
                return;

            }else if(sum<target){
                lp++;
            }else{
                rp--;
            }
        }
        

System.out.println("not exist");


        
    }

    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=1;i<6;i++){
            arr.add(i);

        }
        find(arr, 8);
        
    }
}