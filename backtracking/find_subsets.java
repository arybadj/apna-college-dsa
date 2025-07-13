import java.util.*;
public class find_subsets {
    public static void fin_subset(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }else{
                System.out.println(ans);
                
            }

return;
        }
        //yes
        fin_subset(str, ans+str.charAt(i), i+1);
        //no
        fin_subset(str, ans, i+1);

    }

    public static void main(String[] args) {
        String str="abcdefghijklmnopqrst";
        fin_subset(str, "", 0);
        
    }
}