import java.util.*;
public class usingjcf {


    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(4);
        q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}