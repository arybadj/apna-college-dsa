import java.util.*;
public class stock_span_prob {
    public static void stockspan(int stock[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1;i<stock.length;i++){
            int currprice=stock[i];
            while(!s.isEmpty() && currprice>stock[s.peek()]){// we had put the 0th index but here we are mentioning
                //this stock[s.peek()]) so this will cover everything
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevhigh=s.peek();
                span[i]=i-prevhigh;// so if the while loop breaks we will land into this condition for 85
                //s.peek() will let us see the top elemnt which is greater than currrent price 
                // so what we will do is use that index to get the value of span index
            }
            s.push(i);
        }

    }

    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockspan(stocks, span);

        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }
        
    }
}