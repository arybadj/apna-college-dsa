import java.util.*;

public class container_with_water_bruetforce {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        int max=Integer.MIN_VALUE;

        // Adding heights
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Heights: " + height);
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int total_height=Math.min(height.get(i), height.get(j));
                int width=j-i;
                int water=total_height*width;
                if(max<water){
                    max=water;
                }
            }
        }
        System.out.println(max);

    }
}
