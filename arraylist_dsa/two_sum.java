import java.util.*;
public class two_sum {
    public static void find(ArrayList <Integer> arr,int target){
        int bp=-1;
        int n=arr.size();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>arr.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(arr.get(lp)+arr.get(rp)==target){
                System.out.println("found");
                return;
            }else if(arr.get(lp)+arr.get(rp)>target){
                rp=(n+rp-1)%n;

            }else{
                lp=(lp+1)%n;
            }
        }


    }

    public static void main(String[] args) {
        
ArrayList<Integer> list = new ArrayList<>();
//11, 15, 6, 8, 9, 10 —- Sorted & Rotated
    list.add (11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add (10);
    int target = 16;
    find(list, target);
        
    }
}