import java.util.*;
// import java.util.Collections;
public class sorting_in_al {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Boolean> check=new ArrayList<>();
        // operation
        // 1. add
        list.add(1);
        list.add(22);
        list.add(5);
        list.add(20);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        // to print it in decending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        }
    }
