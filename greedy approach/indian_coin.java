import java.util.*;

public class indian_coin {

    public static void main(String[] args) {
        int coin[] = {1, 2, 5, 10,20, 50, 100, 500, 2000};
        int amt = 590;
        int count = 0;

        // Run the loop backward (descending order)
        for (int i = coin.length - 1; i >= 0; i--) {
            while (amt >= coin[i]) {
                amt -= coin[i];
                count++;
                System.out.println("Used coin: " + coin[i]);
            }
        }

        System.out.println("Total coins used: " + count);
    }
}
