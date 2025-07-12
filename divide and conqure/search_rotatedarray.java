import java.util.*;

public class search_rotatedarray {
    public static int search(int arr[], int target, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // best case
        if (arr[mid] == target) {
            return mid;
        }

        // mid of line 1
        if (arr[si] <= arr[mid]) {
            // case a: left
            if (arr[si] <= target && arr[mid] >= target) {
                return search(arr, target, si, mid - 1);

            } else {
                return search(arr, target, mid + 1, ei);
            }
        } else {
            // line on l2
            

                if (arr[mid] <= target && arr[ei] >= arr[mid]) {
                    return search(arr, target, mid + 1, ei);
                } else {
                    return search(arr, target, si, mid - 1);
                }
            

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int indx = search(arr, target, 0, arr.length - 1);
        System.out.println(indx);

    }
}