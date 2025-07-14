import java.util.*;
public class basic {

    public static void main(String[] args) {
        // collection framework-- it has inbuilt ds
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Boolean> check=new ArrayList<>();
        // operation
        // 1. add
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(20);
        // if we want to add aparticlar value at an index
        list.add(0, 35);  // tc 0(n)

        System.out.println(list);
        // 2.get element
        int elemnt=list.get(0);// we have given the index here
        System.out.println(elemnt);

        // // 3. remove an element
        // list.remove(2);// we are removing the value at index 2
        // System.out.println(list);

        // 4. set new element at the new place
        list.set(2, 100);// index 2 pe new value
        System.out.println(list);

        // 5. if the list contains that elememt
        System.out.println(list.contains(2));
        System.out.println(list.contains(56));
    }
}