import java.util.*;
public class linearsearch {
    public static void search(int var[],int key){
        for(int i=0;i<var.length;i++){
            if(var[i]==key){
                System.out.println("found at index "+i);
                return;
            }else{
                
            }

        }
        System.out.println("there is no such element in this");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int marks[]={1,2,3,4,5,6,7,8,9,10,11,256};

        search(marks, key);
        
    }
}