import java.util.*;
public class trapping_rainwater {
    public static int trapped(int height[]){
        int left_max[]=new int[height.length];
        left_max[0]=height[0];
        for(int i=1;i<height.length;i++){
            left_max[i]=Math.max(left_max[i-1],height[i]);
        }
        int right_max[]=new int[height.length];
        right_max[height.length-1]=height[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            right_max[j]=Math.max(right_max[j+1],height[j]);
        }
        int trappedwater=0;
        for(int i=0;i<height.length;i++){

            int waterlevel=Math.min(left_max[i], right_max[i]);
            trappedwater+=waterlevel-height[i];
        
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapped(height));
        
    }
}