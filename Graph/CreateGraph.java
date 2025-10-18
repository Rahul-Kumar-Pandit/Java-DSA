package Graph;

import java.util.ArrayList;

public class CreateGraph {
    // Store a Edge information 
    static class Edge{
        int src;        // Source 
        int dest;      //  Destination 
        int wt;       //   Weight  

        public Edge(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        /* 
                5
            0 ------ 1
                    / \
                 1 /   \ 3
                  /  1  \
                 2 ----- 3 
                 |
                 | 2
                 |
                 4   
         */

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // 0 - Vertex
        graph[0].add(new Edge(0, 1, 5));
        
        // 1 - Vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 - Vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 - Vertex 
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 - Vertex 
        graph[4].add(new Edge(4, 2, 2));

        // 2's neighbors
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i); // Src,Dest,Wt
            System.out.println(e.dest);
        }
    }
}
