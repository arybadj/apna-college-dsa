import java.util.*;
public class tree_hs {

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
        System.out.println();
        TreeSet<String> ts=new TreeSet<>();
        ts.add("jaipur");
        ts.add("delhi");
        ts.add("punjab");
        ts.add("hiiiiii");
        System.out.println(ts);
    }
}