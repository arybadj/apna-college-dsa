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

// adding head
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
    // adding tail
    public void addlast(int data){
        // step 1 create a node
        node newnode=new node(data);
        if(head==null){// by deafult we always consider a ll be empty if the head is null
            tail=head=newnode;
        }

        // step 2 tail next to point to new node 
        tail.next=newnode;
        // step 3 making new tail
        tail=newnode;
        // // step4 assigning tail node to null
        // tail.next=null; this is for understanding that this will happen automatically
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(5);
    }
}