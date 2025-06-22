import java.util.*;

public class diagonal_sum {
    public static int o_diagonal(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }

        }
        return sum;
    }


    public static void main(String[] args) {
        int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {4, 5, 6}
};
    System.out.println(o_diagonal(matrix));
        
    }

    
}