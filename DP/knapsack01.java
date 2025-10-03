public class knapsack01 {

    public static int knap(int val[],int wt[],int w,int n){

        if(n==0||w==0){
            return 0;
        }
        int ans1=val[n-1]+knap(val, wt, w-wt[n-1], n-1);
        int ans2=knap(val, wt, w, n-1);
        return Math.max(ans1, ans2);

    }
}