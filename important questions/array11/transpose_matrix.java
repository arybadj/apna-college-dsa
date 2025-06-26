import java.util.*;

public class transpose_matrix {
    public static void transpose(int array[][]){
        int m=array[0].length;int n=array.length;
        int trans[][]=new int[m][n];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                trans[j][i]=array[i][j];
            }
        }for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++){
                System.out.print(trans[i][j]+" ");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][]matrix= { {2,3,7}, {5,6,7} };
        transpose(matrix);
        
    }

    
}