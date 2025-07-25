import java.util.*;
public class using_sort_activity_selection {

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int act[][]=new int[end.length][3];
        for(int i=0;i<end.length;i++){
            act[i][0]=i;
            act[i][1]=start[i];
            act[i][2]=end[i];
        }

        // sort
        Arrays.sort(act, Comparator.comparingInt(o -> ((int[]) o)[2]));

        int maxact=0;
        ArrayList<Integer> ans=new ArrayList<>();
        // setting first as default
        maxact=1;
        ans.add(act[0][0]);
        int prev_end=act[0][2];
        for(int i=1;i<end.length;i++){

            if(act[i][1]>=prev_end){
                maxact++;
                ans.add(act[i][0]);
                prev_end=act[i][2];
            }
        }
        System.out.println(ans);
    }
}