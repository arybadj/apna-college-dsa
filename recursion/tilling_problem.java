import java.util.*;
public class tilling_problem {
    public static int no_tile(int n){
        // base case
        if(n==0||n==1){
            return 1;
        }
        
        
        
        // kaam
        int vertical_tiles=no_tile(n-1);
        int horizontal_tiles=no_tile(n-2);
        int total=horizontal_tiles+vertical_tiles;
        return total;

    }

    public static void main(String[] args) {
        System.out.println(no_tile(4));
    }
}