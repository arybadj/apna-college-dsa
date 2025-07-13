import java.util.*;
public class basics {
    public static void backtrack(int arr[],int i,int value){
        // base case
        if(i==arr.length){
            printarr(arr);
            return;
        }

        // work
        arr[i]=value;
        backtrack(arr, i+1, value+1);//recursion call function
        arr[i]=arr[i]-2;//backtracking
        
    }
    public static void printarr(int arr[]){
        
        
        
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");}
            System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        backtrack(arr, 0, 1);
        printarr(arr);
        
    }
}