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
    public int remove_start(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        int value=head.data;
        head=head.next;
        size--;
        return value;
    }
    // Remove from end
    public int remove_end() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int value = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }




    public int search_iterative(int key){
        node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        

        return -1;
    }


    public void reverse(){
        node prev=null;
        node curr=tail=head;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        // ll.print();
        ll.addfirst(1);
        // ll.print();
        ll.addfirst(2);
        // ll.print();
        ll.addlast(5);
        ll.addlast(55);
        // ll.print();
        ll.adding_at(3, 10);
        ll.print();
        // ll.find_size(); till will taking 0(n) tc
        // ll.remove_start();
        // ll.remove_end();
        // ll.print();
        // System.out.println(ll.search_iterative(55));
        ll.reverse();
        ll.print();
        System.out.println("the size of the linked list is : "+ll.size);// this is running in constant time 
    }
}