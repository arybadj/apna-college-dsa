import java.util.*;
public class activityselection {

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        int maxact=0;
        ArrayList<Integer> ans=new ArrayList<>();
        // making first as default
        maxact=1;
        ans.add(0);
        int prev_end=end[0];
        for(int i=1;i<end.length;i++){

            if(start[i]>=prev_end){

                maxact++;
                ans.add(i);
                prev_end=end[i];
            }
            
        }
        System.out.println(ans);
    }
}