import java.util.*;

public class intro {
    public static void search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (key == matrix[i][j]) {
                    System.out.println("We found that shittt!!");
                    return; // Exit immediately once found
                }
            }
        }

        // This line only runs if key wasn't found in entire matrix
        System.out.println("not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int a = 4;
        search(matrix, a);
    }
}
