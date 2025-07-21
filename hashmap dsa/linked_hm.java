import java.util.*;
public class linked_hm {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
        hm.put("India", 100);
        hm.put("China", 210);
        hm.put("chile", 57);
        System.out.println(hm);
        //get 
        System.out.println(hm.get("India"));
    }
}