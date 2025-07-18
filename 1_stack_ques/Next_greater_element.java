import java.util.*;
public class Next_greater_element {

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int arr[]={6,8,0,1,3};
        int nextgreater[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            

            //1 while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            //if else
            if(s.isEmpty()){
                nextgreater[i]=-1;
            }else{
                nextgreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int j=0;j<nextgreater.length;j++){
        System.out.println(nextgreater[j]);
    }

    }}
