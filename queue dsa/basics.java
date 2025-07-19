import java.util.*;
public class basics {
// queue using array
    static class queue{
        static int arr[];
        static int size;
        static int rear;

        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isempty_arr(){
            return rear==-1;
        }
        // add
        public static void add_arr(int data){
            if(rear==size-1){
                System.out.println("queue is full");

            }
            rear=rear+1;
            arr[rear]=data;
        }
        // remove 
        public static int remove_arr(){
            if(isempty_arr()){
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        // peek
        public static int peek_arr(){
            if(isempty_arr()){
                return -1;
            }
            int front=arr[0];
            return front;

        }
    }
    public static void main(String[] args) {
        queue q=new queue(3);
        q.add_arr(0);
        q.add_arr(10);
        q.add_arr(5);
        // abhi agr stack hota toh ulta ho jaata
        while(!q.isempty_arr()){
            System.out.println(q.peek_arr());
            q.remove_arr();
        }


    }
}