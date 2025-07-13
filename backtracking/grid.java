import java.util.*;
public class grid {
    public static int countways(int i,int j,int m,int n){
        //base case
        if(i==n-1 && j==m-1){
            //condition for last cell
            return 1;

        
        }else if(i==n||j==m){
            return 0;


        }// boundary cross condition
        int w1=countways(i+1, j, m, n);
        int w2=countways(i, j+1, m, n);
        return w1+w2;
    } 

    public static void main(String[] args){
        System.out.println(countways(0, 0, 3, 3));
    }
}