import java.util.*;


public class intro {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        // Insert 0(1)
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("Bhutan", 16);
        System.out.println(hm);

        // // get 0(1)
        // int pop=hm.get("India");
        // System.out.println(pop);
        // System.out.println(hm.get("me"));

        // // contains o(1)
        // System.out.println(hm.containsKey("China"));

        // // rmeove
        // hm.remove("China");
        // System.out.println(hm);
        //size
        System.out.println(hm.size());
        // empty
        System.out.println(hm.isEmpty());

        // hm.clear();
                System.out.println(hm.isEmpty());
    // iterate in hashmap
    Set<String> keys=hm.keySet();
    System.out.println(keys);

    for (String k : keys) {
        System.out.println("keys= "+k+" values= "+hm.get(k));
        
    }

    }
    

    
}