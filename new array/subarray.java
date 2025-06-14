import java.util.*;
public class subarray {
    public static void traverse(int array[]){
        for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=i;j<array.length;j++){
                int end=j;
                for(int q=start;q<=end;q++){
                    System.out.print(array[q]+",");
                }System.out.println();
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        // subarray are the continous part of subaaray
        int arr[]={1,2,3,4,5};
        traverse(arr);
    }
}