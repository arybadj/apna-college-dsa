// package OOPS;
import java.util.*;
public class Oops {
    public static void main(String[] args) {
        Pen p1=new Pen("blizard");
        // p1.Changecolor("black");
        // p1.Changetip(5);
        // System.out.println(p1.color);
        // p1.Changecolor("yellow");
        System.out.println(p1.getcolor());
        p1.Changetip(5);
        p1.Changetip(12);
        System.out.println(p1.gettip());
        
    }
    
}
class Pen{
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }

    void Changecolor(String color){// these are setters
        this.color=color;// in which this will point toward the property of pen and other color is outside varibable
    }
    void Changetip(int newtip){// thse are setters
        tip=newtip;
    }
    Pen(String color){
        this.color=color;
        System.out.println("constrcuctor aagya oyeeeeeeeeee");
    }
}
