import java.util.*;
public class binartodeci {
    public static void convertbintodeci(int binnum){
        int deci = 0;
        int pow = 0;
        
        while (binnum > 0) {
            int lastdigit = binnum % 10;
            deci = deci + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binnum = binnum / 10;
        }
        
        System.out.println("My decimal number is: " + deci);
    }

    public static void main(String[] args) {
        convertbintodeci(1001);  // Corrected method call
    }
}