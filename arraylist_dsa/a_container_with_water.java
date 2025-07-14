import java.util.*;
public class a_container_with_water {
    public static int find(ArrayList <Integer> height){
        int total=0;
        int ip=0;int lp=height.size()-1;
        while(ip<lp){
            int ht=Math.min(height.get(ip),height.get(lp));
            int width=lp-ip;
            total=Math.max(total, ht*width);
            if(height.get(ip)<height.get(lp)){
                ip++;

            }else{
                lp--;
            }


        }



        return total;
    }

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
        System.out.println(find(height));
        
    }
}