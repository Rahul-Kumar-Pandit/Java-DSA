package Graph;

import java.util.ArrayList;

public class BridgeInGraph {
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
        // graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));
    }

    // main work in dfs function
    public static void dfs(ArrayList<Edge>graph[],int curr,int par,int[]dt,int[]low,boolean[]visit,int time){

        visit[curr] = true;
        dt[curr] = low[curr] = ++time;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            int neighbor = e.dest;
            if(neighbor == par){
                continue;
            }else if(!visit[neighbor]){
                dfs(graph, neighbor, curr, dt, low, visit, time);
                low[curr] = Math.min(low[curr],low[neighbor]);
                // Bridge condition 
                if(dt[curr] < low[neighbor]){
                    System.out.println("Bridge : "+ curr + " ------ "+neighbor);
                }
            }else{
                low[curr] = Math.min(low[curr],dt[neighbor]);
            }

        }
    }
    public static void tarjanBridge(ArrayList<Edge>[] graph, int V) {
        int[] dt = new int[V]; // dt --> discovery time
        int[] low = new int[V]; // low => lowest discovery time

        int time = 0;
        boolean[] visit = new boolean[V];

        for(int i=0; i<V; i++){
            if(!visit[i]){
                dfs(graph, i, -1, dt, low, visit, time);
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        tarjanBridge(graph, V);
    }
}


