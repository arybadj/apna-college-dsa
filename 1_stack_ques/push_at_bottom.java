import java.util.*;
public class push_at_bottom {
    public static void pushatbottomofstack(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int top=s.pop();
        pushatbottomofstack(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);
        pushatbottomofstack(s, 54);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}