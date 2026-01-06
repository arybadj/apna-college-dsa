public class decreasing {

    public static void inc(int n){

        if(n==1){
            System.out.println(n+" ");
            return;
        }
        inc(n-1);
        System.out.println(n+" ");
    }
    public static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int nsum(int n){
        if(n==1){
            return n;
        }
        return n+nsum(n-1);
    }
    public static int fibo(int n){
        if(n==1||n==0){
            return n;
        }
        n=fibo(n-1)+fibo(n-2);
        return n;
    }
    public static boolean check(int[] nums,int i){
        if(i==nums.length-1){
            return true;
        }
        if(nums[i]>nums[i+1]){
            return false;
        }
        return check(nums, i+1);
    }

    public static void main(String[] args) {
        // inc(5);
        // System.out.println(fact(1));
        // System.out.println(nsum(5));
        int[] nums={2,5,6,8,11};
        System.out.println(check(nums,0));
    }
}