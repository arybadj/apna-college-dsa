import java.util.*;
public class reverse_a_stack {
    public static void pushatbottomofstack(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int top=s.pop();
        pushatbottomofstack(s, data);
        s.push(top);
    }
    public static void revser_stack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        revser_stack(s);
        pushatbottomofstack(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        revser_stack(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        // revser_stack(s);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
    }
}