import java.util.*;
public class tree_hm {

    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 210);
        tm.put("chile", 57);
        System.out.println(tm);
        // sorted order
        //get 
        System.out.println(tm.get("India"));
    }
}