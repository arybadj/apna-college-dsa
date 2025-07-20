import java.util.*;

public class implementation_using_2stack {

    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Add element to the queue
        public void add(int data) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Push new element to s1
            s1.push(data);

            // Move everything back from s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove element from the queue
        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        // Peek element from the queue
        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return s1.isEmpty();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Removed: " + q.remove()); // 10
        System.out.println("Peek: " + q.peek());      // 20

        q.add(40);
        System.out.println("Removed: " + q.remove()); // 20
        System.out.println("Removed: " + q.remove()); // 30
        System.out.println("Removed: " + q.remove()); // 40

        System.out.println("Is queue empty? " + q.isEmpty()); // true
    }
}
