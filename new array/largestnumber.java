import java.util.*;

public class largestnumber {
    public static int lar_num(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest value is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int array[] = {1, 5, 8, 3, 15, 1};
        int a = lar_num(array);
        System.out.println("Largest value is " + a);
    }
}
