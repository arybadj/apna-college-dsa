package graphss;

import java.util.*;
public class grph {
    static class edge{
        int src;
        int dest;
        int wt;
        public edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    @SuppressWarnings("unchecked")

    public static void main(String[] args) {
        int v=5;//vertex is the number of arraylist we will create
        ArrayList<edge>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();

        }
        // 0 vertex
        graph[0].add(new edge(0, 1, 5));
        
        //1 vertex
        graph[1].add(new edge(1, 0, 5));
        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 3));

        //2 vertex
        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 4, 2));
        graph[2].add(new edge(2, 3, 1));

        //3
        graph[3].add(new edge(3, 2, 1));
        graph[3].add(new edge(3, 1, 3));

        //4
        graph[4].add(new edge(4, 2, 2));



        //find neighbours of 2
        for(int j=0;j<graph[2].size();j++){
            edge e=graph[2].get(j);
            System.out.println(e.dest);
        }
        
    }


    
}