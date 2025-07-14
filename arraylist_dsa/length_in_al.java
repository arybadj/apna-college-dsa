import java.util.*;
public class length_in_al {

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
        
System.out.println(list.size());        

// print array list
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}