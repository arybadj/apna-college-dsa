import java.util.*;
public class basics {
// queue using array for nomral array
    // static class queue{
    //     static int arr[];
    //     static int size;
    //     static int rear;

    //     queue(int n){
    //         arr=new int[n];
    //         size=n;
    //         rear=-1;
    //     }
    //     public static boolean isempty_arr(){
    //         return rear==-1;
    //     }
    //     // add
    //     public static void add_arr(int data){
    //         if(rear==size-1){
    //             System.out.println("queue is full");

    //         }
    //         rear=rear+1;
    //         arr[rear]=data;
    //     }
    //     // remove 
    //     public static int remove_arr(){
    //         if(isempty_arr()){
    //             return -1;
    //         }
    //         int front=arr[0];
    //         for(int i=0;i<rear;i++){
    //             arr[i]=arr[i+1];
    //         }
    //         rear--;
    //         return front;
    //     }
    //     // peek
    //     public static int peek_arr(){
    //         if(isempty_arr()){
    //             return -1;
    //         }
    //         int front=arr[0];
    //         return front;

    //     }
    // }

    // array creating circular queue
    
    // static class queue{
    //     static int arr[];
    //     static int size;
    //     static int rear;
    //     static int front;

    //     queue(int n){
    //         arr=new int[n];
    //         size=n;
    //         rear=-1;
    //         front=-1;
    //     }
    //     public static boolean isempty_arr(){
    //         return rear==-1 && front==-1;
    //     }
    //     //isfull circular queue using array
    //     public static boolean isfull_cirx(){
    //         return (rear+1)%size==front;
    //     }
    //     // add
    //     public static void add_arr(int data){
    //         if(isfull_cirx()){
    //             System.out.println("queue is full");
    //             return;

    //         }
    //         //while adding first elemnt
    //         if(front==-1){
    //             front=0;
    //         }
    //         rear=(rear+1)%size;
    //         arr[rear]=data;
    //     }
    //     // remove 
    //     public static int remove_arr(){
    //         if(isempty_arr()){
    //             return -1;
    //         }
    //         int result=arr[front];
            

    //         // fi we are deleting last elemnt
    //         if(rear==front){
    //             rear=front=-1;
    //         }else{
    //             front=(front+1)%size;
    //         }
            
            
    //         return result;
    //     }
    //     // peek
    //     public static int peek_arr(){
    //         if(isempty_arr()){
    //             return -1;
    //         }
    //         // int front=arr[0];
    //         return arr[front];

    //     }}
    static class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class queue{
        static node head=null;
        static node tail=null;

    }
        public static boolean isempty_ll(){
            return head==null&&tail==null;
        }
        //isfull circular queue using array no need as we we no restriction
        
        // add
        public static void add_ll(int data){
            node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
                return;

            }
            
            tail.next=newnode;
            tail=newnode;
        }
        // remove 
        public static int remove_ll(){
            if(isempty_ll()){
                return -1;
            }
            
            int front=head.data;
            if(tail==head){
                head=tail=null;
            }else{
            head=head.next;}
            return front;
        }
        // peek
        public static int peek_arr(){
            if(isempty_arr()){
                return -1;
            }
            // int front=arr[0];
            return head.data;

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