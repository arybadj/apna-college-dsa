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
    public static int size;
    // now we will create methods to perform operations in linkeed list

// adding head
    public void addfirst(int data){

        // step 1 craete node 
        node newnode=new node(data);
        size++;
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
    public void addlast(int data){// 0(1)
        // step 1 create a node
        node newnode=new node(data);
        size++;
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
    // print linked list
    public void print(){ //0(n)
        // if(head==null){
        //     System.out.println("ll is empty");
        //     return;
        // }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public void adding_at(int indx,int data){
        node newnode=new node(data);
        size++;
        int i=0;
        node temp=head;
        while(indx-1>i){
            temp=temp.next;
            i++;

        }
        // i =index-1 iska mtlb temp is previous
        newnode.next=temp.next;// as we know that prev was storing index value of next so we will copy that value to news next
        temp.next=newnode;


    }


    // to find the size in a ll
    // public void find_size(){
    //     int i=0;
    //     node temp=head;
    //     while(temp!=null){
    //         temp=temp.next;
    //         i++;
    //     }
    //     System.out.println("size of linked list : "+i);
    // }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addlast(5);
        ll.addlast(55);
        ll.print();
        ll.adding_at(3, 10);
        ll.print();
        // ll.find_size();
        System.out.println("the size of the linked list is : "+ll.size);
    }
}