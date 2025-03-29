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
    public static void main(String[] args) {
        // hollowrectang(5, 6);
        inv_pyramid(4, 4);

    }
}