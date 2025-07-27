import java.util.*;
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

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,-1,3,-1,6,-1,-1};
        Binary_tree tree=new Binary_tree();
        node root=tree.Btree(nodes);
        System.out.println(root.data);
    }
}