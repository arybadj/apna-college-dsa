import java.util.*;
public class sorting {

    public static void merge_sort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        // caluclate mid
        int mid=si+(ei-si)/2;
        merge_sort(arr, si, mid);
        merge_sort(arr, mid+1, ei);
        merge(arr, si, ei, mid);

    }
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];
        int i=si;// starting index for the left part
        // mid = si + (ei - si) / 2;

        int j=mid+1;// starting index for the right part
        int k=0;// starting index of temp variable
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }else{
                temp[k]=arr[j];
                j++;k++;
            }
        }



        // left part
        while (i<=mid) {
            temp[k++]=arr[i++];
            
        }

        // right part
        while (j<=ei) {
            temp[k++]=arr[j++];
            
        }


        // copy temp to original
        for (int m = 0; m < temp.length; m++) {
    arr[si + m] = temp[m];
}

    }





    public static void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={55,62,1,6,95};
        merge_sort(arr, 0, arr.length-1);
        print_array(arr);
        
    }
}