import java.util.*;
public class spiral_matrix {
    public static void search(int matrix[][]){
        int s_row=0;int l_row=matrix.length-1;int s_col=0;int l_col=matrix[0].length-1;
        while(s_row<=l_row && s_col<=l_col){
            // for the first row
            for(int i=s_col;i<l_col;i++){
                System.out.println(matrix[s_row][i]);

            }
            //right column
            for(int i=s_row;i<l_row;i++){
                System.out.println(matrix[i][l_col]);
            }

            //bottom layer
            for(int i=l_col;i>s_col;i--){
                System.out.println(matrix[l_row][i]);
            }

            //left most layer
            for(int i=l_row;i>s_row;i--){
                System.out.println(matrix[i][s_col]);
            }


            s_col++;
            s_row++;
            l_col--;
            l_row--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  2,  3,  4,  5,  6 },
            { 7,  8,  9, 10, 11, 12 },
            {13, 14, 15, 16, 17, 18 },
            {19, 20, 21, 22, 23, 24 },
            {25, 26, 27, 28, 29, 30 },
            {31, 32, 33, 34, 35, 36 }
        };
        search(matrix);
        
    }
}