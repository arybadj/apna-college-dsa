import java.util.*;

public class stackb {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        static node head=null;// initializing node

        public static boolean isempty_node(){
            return head==null;
        }
        //push
        public static void addnew_node(int data){
            node newnode=new node(data);
            
            if(isempty_node()){
                head=newnode;
                return;
            }
            
            newnode.next=head;
            head=newnode;
        }
        // pop linked list
        public static int pop_ll(){
            if(isempty_node()){
                System.out.println("no element to pop");
                return Integer.MIN_VALUE;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        // peek at linked list
        public static int peek_ll(){
            if(isempty_node()){
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }








        // public static boolean isempty() {
        //     return list.size() == 0;
        // }

        // // push
        // public static void push(int data) {
        //     list.add(data);
        // }

        // pop
        // public static int pop() {
        //     if (isempty()) {
        //         System.out.println("Stack is empty");
        //         return -1;
        //     }
        //     int top = list.get(list.size() - 1);
        //     list.remove(list.size() - 1);
        //     return top;
        // }

        // peek
        // public static int peek() {
        //     if (isempty()) {
        //         System.out.println("Stack is empty");
        //         return -1;
        //     }
        //     return list.get(list.size() - 1);
        // }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.addnew_node(1);
        s.addnew_node(4);
        s.addnew_node(10);
        // s.pop_ll();

        while (!s.isempty_node()) {
            System.out.println(s.peek_ll());
            s.pop_ll();
        }
    }
}
