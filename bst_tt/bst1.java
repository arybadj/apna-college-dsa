
import java.util.*;

public class bst1 {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

    // Inorder Traversal
    public static void inorder(node root) {
        if (root == null) {
            return; // base case
        }
        inorder(root.left);
        System.out.print(root.data + " "); // print on same line
        inorder(root.right);
    }

    // Insert into BST
    public static node insert(node root, int value) {
        if (root == null) {
            return new node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void main(String[] args) {
        int val[] = {5, 1, 3, 4, 2, 7};
        node root = null;

        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]); // update root
        }

        System.out.println("Inorder Traversal:");
        inorder(root);
    }
}
