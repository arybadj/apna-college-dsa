import java.util.*;
public class min_absoulte_diff {

    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={2,1,3};
        Arrays.sort(a);
        Arrays.sort(b);
        int min_abs=0;

        for(int i=0;i<a.length;i++){
            min_abs+=Math.abs(a[i]-b[i]);
        }
        System.out.println(min_abs);


    }
}