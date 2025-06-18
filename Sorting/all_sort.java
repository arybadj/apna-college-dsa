import java.util.*;

public class all_sort {
    public static void bubblesort(int array[]) {
        for (int turns = 0; turns <= array.length - 2; turns++) {
            for (int j = 0; j <= array.length - turns - 2; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printarr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void selection_sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < array.length; j++) {  // ✅ Fixed here
                if (array[minpos] > array[j]) {
                    minpos = j;
                }
            }
            // Swap
            int temp = array[minpos];
            array[minpos] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int array[] = {5, 7, 6, 2, 1};
        selection_sort(array);
        printarr(array);
    }
}
