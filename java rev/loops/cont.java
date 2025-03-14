import java.util.*;
public class cont {

    public static void main(String[] args) {
        Scanner op=new Scanner(System.in);
        int n=op.nextInt();
        for(int i =0;i<20;i++){
            if (i%3==0){
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}