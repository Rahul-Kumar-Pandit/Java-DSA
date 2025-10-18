package Graph;

import java.util.ArrayList;

public class ArticulationPoint {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge>[]graph,int curr,int par,int dt[],int low[],int time,boolean visit[],boolean ap[]){
        visit[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            int neighbor = e.dest;

            if(par == neighbor){
                // Ignore
                continue;
            }else if(visit[neighbor]){
                low[curr] = Math.min(low[curr],dt[neighbor]);
            }else{
                dfs(graph, neighbor, curr, dt, low, time, visit,ap);
                low[curr] = Math.min(low[curr],low[neighbor]);

                // Check articulation point
                if(par != -1 && dt[curr]<=low[neighbor]){
                    ap[curr] = true;
                }
                children++;
            }
        }

        if(par == -1 && children>1){
            ap[curr] = true;
        }
    }
    public static void getArticulationPoint(ArrayList<Edge>[] graph, int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean visit[] = new boolean[V];
        
        boolean ap[] = new boolean[V];      // It track my articulation point

        for (int i = 0; i < V; i++) {
            if (!visit[i]) {
                // DFS
                dfs(graph, i, -1, dt, low, time, visit,ap);
            }
        }

        // Print all Articulation Point 
        for(int i=0; i<V; i++){
            if(ap[i]){
                System.out.println("Ap : "+i);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        getArticulationPoint(graph, V);
    }
}
