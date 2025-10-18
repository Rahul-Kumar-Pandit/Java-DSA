package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class StronglyConnectedComponents {
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

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] visit, Stack<Integer> s) {
        visit[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!visit[e.dest]) {
                topSort(graph, e.dest, visit, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean visit[]) {
        visit[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dest]) {
                dfs(graph, e.dest, visit);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void kosarajus(ArrayList<Edge>[] graph, int V) {
        // Step1 => (Topological sort)
        Stack<Integer> s = new Stack<>();
        boolean[] visit = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visit[i]) {
                topSort(graph, i, visit, s);
            }
        }

        // Step 2 => Transpose Graph
        ArrayList<Edge>[] transpose = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            transpose[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            visit[i] = false;
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j); // e.src -> e.dest
                transpose[e.dest].add(new Edge(e.dest, e.src)); // reverse Edge (e.dest -> e.src)
            }
        }

        // Step 3 -> Do DFS according to Stack nodes on the transpose graph

        while (!s.isEmpty()) {
            int curr = s.pop();
            if(!visit[curr]){
                System.out.print("Strongly Connected Components : ");
                dfs(transpose, curr, visit);
                System.out.println();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        kosarajus(graph, V);
    }
}
