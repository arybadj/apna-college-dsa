import java.util.*;
public class fin_max {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Boolean> check=new ArrayList<>();
        // operation
        // 1. add
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(20);
        System.out.println(list);
        int max=list.get(0);
        for(int i=1;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }System.out.println(max);
        

        }
    }
