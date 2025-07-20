import java.util.*;
public class check {

    public static void main(String[] args) {
        int arr[]={1,2,3,45,5};
        for(int num : arr) {
    System.out.print(num + " ");
}
// Binary search (sorted array)
int index = Arrays.binarySearch(arr, 3);
System.out.println(index);
    }
}