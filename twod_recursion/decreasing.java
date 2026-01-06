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

    public static void main(String[] args) {
        // inc(5);
        System.out.println(fact(1));
    }
}