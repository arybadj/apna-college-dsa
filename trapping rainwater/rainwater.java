import java.util.*;
public class rainwater {

    public static void trapped(int height[]){
        int array1[]=new int[height.length];
        array1[0]=height[0];
        int sum=0;
        int array3[]=new int[height.length];
        
        int array2[]=new int[height.length];
        array2[height.length]=height[height.length];
        int waterlevel[]=new int[height.length];
        for(int i=1;i<height.length;i++){
            array1[i]=Math.max(array1[i-1],height[i]);

        }
        for(int j=height.length;j<0;j--){
            array1[i]=Math.max(array1[i-1],height[i]);

        }
        for(int k=0;k<height.length;k++){
            waterlevel[k]=Math.min(array1[k],array2[k]);
            
        }
        for(int q=0;q<height.length;q++){
            array3[q]=waterlevel[q]-height[q];

        }
        for(int p=0;p<height.length;p++){
            sum+=array3[p];
        }
        System.out.println("the sum is "+sum);
    }
    public static void main(String[] args) {
        int array[]={4,2,0,6,3,2,5};
        trapped(array);
    }
}