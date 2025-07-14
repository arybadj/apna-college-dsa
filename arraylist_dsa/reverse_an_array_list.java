import java.util.*;
public class reverse_an_array_list {

    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Boolean> check=new ArrayList<>();
        // operation
        // 1. add
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(20);
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));

        }

        
    }
}