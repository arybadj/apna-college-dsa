import java.util.*;
public class LinkedList {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    // now we will create methods to perform operations in linkeed list


    public void addfirst(int data){
        // step 1 craete node 
        node newnode=new node(data);
        
        if(head==null){
            head=tail=newnode;
            return;
        }
        
        
        

        // step 2 newnode next=head
        newnode.next=head;

        // step 3 head=newnode
        head=newnode;
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addfirst(1);
        ll.addfirst(2);
        
    }
}