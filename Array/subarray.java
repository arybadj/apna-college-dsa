import java.util.*;

public class subarray {
    public static void printAllSubarrays(int arr[]) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Print subarray from index `start` to `end`
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); // next subarray
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        System.out.println("All Subarrays:");
        printAllSubarrays(arr);
    }
}
