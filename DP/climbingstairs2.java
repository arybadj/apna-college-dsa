public class climbingstairs2 {
    public static int str(int n,int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n]
        }
        ways[n]=str(n-1, ways)+str(n-2, ways);
        return ways[n];
    }
    
}
