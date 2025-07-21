import java.util.*;
public class hashset_dsa {

    public static void main(String[] args) {
        // HashSet<Integer> hs=new HashSet<>();
        // hs.add(1);
        // hs.add(3);
        // hs.add(50);
        // hs.add(1);
        // System.out.println(hs);

        // if(hs.contains(3)){
        //     System.out.println("it contains");
        // }
        // System.out.println(hs.size());
        // hs.clear();
        // System.out.println(hs.isEmpty());
        // System.out.println(hs.remove(3));
        // System.out.println(hs);
        HashSet<String> hs=new HashSet<>();
        hs.add("jaipur");
        hs.add("delhi");
        hs.add("punjab");
        hs.add("hiiiiii");
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // adv loop
        for(String city:hs){
            System.out.println(city);
        }
    }
}