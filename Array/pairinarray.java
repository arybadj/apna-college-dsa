import java.util.*;
public class pairinarray {
    public static void formpair(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print(arr[i]+","+arr[j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,45};
        formpair(arr);

        
    }
}