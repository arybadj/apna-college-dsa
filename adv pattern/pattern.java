import java.util.*;
public class pattern {
    public static void hollowrectang(int row,int colu){

        //outer loop
        for(int i=1;i<=row;i++){

            for(int j=1;j<=colu;j++){

                if(i==1||i==row||j==1||j==colu){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void inv_pyramid(int row,int colu){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void cut_pyramid(int row,int colu){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print("");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void num_half_pyramid(int n){
        // int a=n;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
                // a++;
            }
            System.out.println();
        }

    }
    public static void numpyra(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // hollowrectang(5, 6);
        // inv_pyramid(12, 16);
        // cut_pyramid(4, 4);
        // num_half_pyramid(4);
        numpyra(5);

    }
}