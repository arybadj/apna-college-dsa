import java.util.*;
public class multi_dimentional_list {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);list.add(5);
        mainlist.add(list);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(14);list2.add(8);
        mainlist.add(list2);

        // print array list
        for(int i=0;i<mainlist.size();i++){
            System.out.println(mainlist.get(i));
        }
        


    }
}