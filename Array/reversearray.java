import java.util.*;

public class reversearray {
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
