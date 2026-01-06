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
    public static int focc(int[] nums,int i,int ele){
        if(i==nums.length-1){
            return -1;
        }
        if(nums[i]==ele){
            return i+1;
        }
        return focc(nums, i+1, ele);
    }
    public static int locc(int[] nums,int i,int ele){
        if(i==0){
            return -1;
        }
        if(nums[i]==ele){
            return i+1;
        }
        return locc(nums, i-1, ele);
    }
    public static int locc1(int[] nums,int i,int ele){
        
        if(i==nums.length-1){
            return -1;
        }
        int ind=locc(nums, i+1, ele);
        if(ind!=-1){
            return ind;
        }
        if(nums[i]==ele){
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        // inc(5);
        // System.out.println(fact(1));
        // System.out.println(nsum(5));
        int[] nums={2,5,6,8,11,11,8,2,2};
        // System.out.println(check(nums,0));
        // System.out.println(focc(nums, 0, 6));
        System.out.println(locc1(nums, 0, 5));
    }
}