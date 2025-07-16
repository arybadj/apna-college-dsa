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
    public void deleteNfrom_end(int n){
        // calulate size
        int size=0;
        node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;

        }
        if(n==size){
            head=head.next;// to remove head
        }
        int i=1;
        node prev=head;
        while(i<size-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
        

    }
// using slow fast approach
    public node find_mid(node head){
        node slow=head;
        node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow; // slow is my middle node

    }
    public boolean palindrone(){
        if(head==null||head.next==null){
            return true;
        }
        // find middle node step 1
        node mid=find_mid(head);

        // reverse the 2nd half of the ll
        node prev=null;
        node curr=mid;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node left=head;
        node right=prev;
        // check if both are equal
        while(right!=null){
            if(left.data!=right.data){
                return false;

            }
            left=left.next;
            right=right.next;
        }

        return true;

    }
    public boolean iscycle(){
        node fast=head;
        node slow=head;


        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;

            }
        }
        return false;
    }

    public void remove_cycle(){
        //detect cycle
        node slow=head;
        node fast=head.next;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
            
            


        }
        if(cycle==false){
                return;
            }
        // find meeting point
        slow=head;
        node prev=null; // last node
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // remove cycle when i will make last.next=null
        prev.next=null;
    }


    public node getmid(node head){
        node slow=head;
        node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        

    }

    public node merge(node head1,node head2){
        node mergell=new node(-1);
        node temp=mergell;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;

        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;

        }
        return mergell.next;
    }
    public node mergesort(node head){
        if(head==null||head.next==null){
            return head;
        }
        // find mid
        node mid=getmid(head);
        //divide into left and right merge sort
        node righthead=mid.next;
        mid.next=null;
        node newleft=mergesort(head);
        node newright=mergesort(righthead);


        //merge
        return merge(newleft,newright);


    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
    ll.addfirst(1);
    ll.addfirst(4);
    ll.addfirst(2);
    ll.addlast(3);
    ll.addlast(4);

    ll.print();
ll.head = ll.mergesort(ll.head);  // Assign the result back to head    
ll.print();

    
    
    }
}