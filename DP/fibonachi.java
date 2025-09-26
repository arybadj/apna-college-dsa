public class fibonachi {
    public static int fivonaci(int n,int j[]){
        if(n==0||n==1){
            return n;
        }
        if(j[n]!=0){
            return j[n];
        }
        j[n]=fivonaci(n-1,j)+fivonaci(n-2,j);
        return j[n];
    }
    public static void main(String[] args) {
        
        System.out.println(fivonaci(12,new int[13]) );
        
        }
    }

