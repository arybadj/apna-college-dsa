import java.util.*;
public class prefix_array_maxsum {
    public static void traverse(int array[]){
        int sum=0;
        int max_num=Integer.MIN_VALUE;
        int prefix[]=new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }





        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                sum=i==0?prefix[j]:prefix[j]-prefix[i-1];



            }if(sum>max_num){
                max_num=sum;
            }
        }
    System.out.println("max sum is "+max_num);}
                
               
    

    public static void main(String[] args) {
        int array[]={1,2,-3,4,5};
        traverse(array);
        
    }
}