import java.util.Arrays;

public class cs3 {
    public static int stair3(int n,int ways[]){
        if(n==0||n==1){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        ways[n]=stair3(n-1, ways)+stair3(n-2, ways)+stair3(n-3, ways);
        return ways[n];
    }
    public static void main(String[] args) {
        int var[]=new int[5];
        Arrays.fill(var,-1);
        System.out.println(stair3(4, var));
    }
}
