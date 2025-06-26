import java.util.*;
public class shortest_path {
    public static float path(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char am=str.charAt(i);
            if(am=='N'){
                y++;
            }else if (am=='S'){
                y--;
            }else if (am=='E'){
                x++;

        }else{
            x--;
        }
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args){
        String dir="WEEENSSNENWSNWSNEWNNEWNSENWWNNSNNNNSSW";
        System.out.println(path(dir));

    }}
