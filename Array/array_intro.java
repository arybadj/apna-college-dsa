import java.util.*;
// operation in array
public class array_intro {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int array[]=new int[50];
        // int ar[]={1,2,3,4,5};
        // System.out.println(ar[3]);
        int arr1[]=new int[10];
        arr1[0]=sc.nextInt();
        arr1[1]=sc.nextInt();
        System.out.println("hey "+arr1[0]+" this is my time "+arr1[1]);
        arr1[1]=arr1[1]+51;
        System.out.println("hey "+arr1[0]+" this is my time "+arr1[1]);
        System.out.println("length of array "+ arr1.length);

        
    }
}