import java.util.*;
public class union_intersection {

    public static void main(String[] args) {
        HashSet<Integer> uhs=new HashSet<>();
        HashSet<Integer> ihs=new HashSet<>();
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        for(int i=0;i<arr1.length;i++){
            uhs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            uhs.add(arr2[i]);
        }
        System.out.println(uhs.size());
        System.out.println(uhs);
        // intersection
        for(int i=0;i<arr1.length;i++){
            ihs.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(ihs.contains(arr2[i])){
                count++;
                System.out.println(arr2[i]);
                ihs.remove(arr2[i]);
            }
        }
        System.out.println("size is "+count);

    }
}