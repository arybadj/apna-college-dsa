// package OOPS;
import java.util.*;
public class Oops {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.Changecolor("black");
        p1.Changetip(5);
        System.out.println(p1.color);
        p1.color="yellow";
        System.out.println(p1.color);
        
    }
    
}
class Pen{
    String color;
    int tip;

    void Changecolor(String newcolor){
        color=newcolor;
    }
    void Changetip(int newtip){
        tip=newtip;
    }
}
