import java.util.*;
public class linked_hashset {

    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("jaipur");
        hs.add("delhi");
        hs.add("punjab");
        hs.add("hiiiiii");
        System.out.println(hs);
        System.out.println("");
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("jaipur");
        lhs.add("delhi");
        lhs.add("punjab");
        lhs.add("hiiiiii");
        System.out.println(lhs);
    }
}