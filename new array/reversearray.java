import java.util.*;
public class reversearray {
    public static void rev_array(int array[]){
        int first=0;int last=array.length-1;
        while(first<last){
            int temp=array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,56,55};
        rev_array(array);
        
        
    }
}