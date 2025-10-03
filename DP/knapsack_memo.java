public class knapsack_memo {
    public static int knap(int val[],int wt[],int w,int n,int arr[][]){
        if(n==0||w==0){
            return 0;
        }
        if(arr[n][w]!=-1){
            return arr[n][w];
        }
        if(wt[n-1]<=w){
            int ans1=val[n-1]+knap(val, wt, w-wt[n-1], n-1, arr);
            int ans2=knap(val, wt, w, n-1, arr);
            arr[n][w]=Math.max(ans1, ans2);
           
    }else{
        knap(val, wt, w, n-1, arr);

    }
    return arr[n][w];
    
}}
