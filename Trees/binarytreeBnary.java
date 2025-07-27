import java.util.*;
import java.util.LinkedList;
public class binarytreeBnary {

    static class node{
        int data;
        node left;
        node right;
        
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        }
        static class Binary_tree{
        static int indx=-1;
        public static node Btree(int nodes[]){
            indx++;
            if(nodes[indx]==-1){
                return null;
            }

            node newnode=new node(nodes[indx]);
            newnode.left=Btree(nodes);
            newnode.right=Btree(nodes);

            return newnode;
        }
    }
    public static void preorder(node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);


    }
    public static void inorder(node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        
        inorder(root.right);


    }
    public static void postorder(node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void level_order(node root){
        if(root==null){
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            node currnode=q.remove();
            if(currnode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currnode.data+" ");
                if(currnode.left!=null){
                    q.add(currnode.left);
                }
                if(currnode.right!=null){
                    q.add(currnode.right);
                }
            }
        }
    }
    public static int height(node root){
        if(root==null){
            return 0;

        }
        int lh=height(root.left);
        int rh=height(root.right);
        
        return Math.max(lh,rh)+1;
    }
    public static int count(node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Binary_tree tree=new Binary_tree();
        node root=tree.Btree(nodes);
        binarytreeBnary.level_order(root);
        System.out.println("count of node: " + count(root));

    }
}