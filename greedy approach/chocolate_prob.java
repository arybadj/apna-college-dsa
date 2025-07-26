import java.util.*;
public class chocolate_prob {

    public static void main(String[] args) {
        int n=4;int m=6;
        Integer ver[]={4,1,3,1,4};
        Integer hor[]={4,1,2};

        Arrays.sort(ver, Comparator.reverseOrder());
        Arrays.sort(hor, Comparator.reverseOrder());

        int h=0; int v=0;
        int hp=1; int vp=1;
        int cost=0;
        while(h<hor.length && v<ver.length){
            if(ver[v]<=hor[h]){
                cost+=(hor[h]*vp);
                hp++;
                h++;

            }else{
                cost+=(ver[v]*hp);
                vp++;
                v++;
            }

        }
        while(h<hor.length){
            cost+=(hor[h]*vp);
                hp++;
                h++;
        }
        while(v<ver.length){
            cost+=(ver[v]*hp);
                vp++;
                v++;
        }
        System.out.println(cost);
    }
}