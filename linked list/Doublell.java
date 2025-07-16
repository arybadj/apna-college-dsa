import java.util.*;
public class Doublell {

    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) { // ✅ Constructor inside Node
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add first
    public void addfirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }
    // print

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next; // ✅ move temp forward!
        }
        System.out.println("null");
    }
    // remove first
    
    public static void main(String[] args) {
        Doublell dll = new Doublell();
        dll.addfirst(3);
        dll.addfirst(4);
        dll.print();
    }
}
