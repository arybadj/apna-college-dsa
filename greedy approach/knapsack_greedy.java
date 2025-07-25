import java.util.*;
public class knapsack_greedy {

    public static void main(String[] args) {
        int value[]={60,100,120};
        int weights[]={10,20,30};
        int w=50;

        double ratio[][]=new double[weights.length][2];
        for(int i=0;i<weights.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weights[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o ->o[1]));

        int capacity=w;
        int final_val=0;

        for(int i=ratio.length-1;i>=0;i--){
            int indx=(int)ratio[i][0];
            if(capacity>=weights[indx]){
                final_val+=value[indx];
                capacity-=weights[indx];
            }else{
                final_val+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }


        }
        System.out.println(final_val);
    }
}