import java.util.*;
public class price {
    public static int track(int range[]){
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0; i < range.length; i++){
            if(range[i] < buy_price){
                buy_price = range[i];
            } else {
                int profit = range[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(track(prices));
    }
}