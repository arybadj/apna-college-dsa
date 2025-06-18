import java.util.*;
public class by_bbblesort {
    public static void bubblesort(int array[]){
        for(int turns=0;turns<=array.length-2;turns++){
            for(int j=0;j<=array.length-turns-2;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        
    }public static void printarr(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int array[]={5,7,6,2,1};
        bubblesort(array);
        printarr(array);
        
    }
}