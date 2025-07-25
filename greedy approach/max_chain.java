import java.util.*;
public class max_chain {

    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int prev=pairs[0][1];
        int ans=1;
        int chains=1;
        ArrayList<Integer> lst=new ArrayList<>();
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>prev){
                ans++;
                prev=pairs[i][1];
            }
            
        }
        System.out.println(ans);
    }
}