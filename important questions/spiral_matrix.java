import java.util.*;
public class spiral_matrix {
    public static void search(int matrix[][]){
        int s_row=0;int l_row=matrix.length-1;int s_col=0;int l_col=matrix[0].length-1;
        int cnt=0;
        int total=matrix.length*matrix[0].length;
        while(s_row<=l_row && s_col<=l_col){
            // for the first row
            for(int i=s_col;i<l_col && cnt<total ;i++){
                cnt++;
                System.out.println(matrix[s_row][i]);

            }
            //right column
            for(int i=s_row;i<l_row&& cnt<total;i++){cnt++;
                System.out.println(matrix[i][l_col]);
            }

            //bottom layer
            for(int i=l_col;i>s_col&& cnt<total;i--){cnt++;
                // if(s_row==l_row){
                //     break;
                // }
                System.out.println(matrix[l_row][i]);
            }

            //left most layer
            for(int i=l_row;i>s_row&& cnt<total;i--){cnt++;
                // if(s_col==l_col){
                //     break;
                // }
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
            { 1,  2,  3,  4,  5 },
            { 7,  8,  9, 10, 11 },
            {13, 14, 15, 16, 17 },
            
        };
        search(matrix);
        
    }
}