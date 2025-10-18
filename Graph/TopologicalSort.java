package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
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

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        // graph[1].add(new Edge(1, 2));
        // graph[1].add(new Edge(1, 3));
        // graph[1].add(new Edge(1, 4));

        // graph[2].add(new Edge(2, 3));
        // graph[2].add(new Edge(2, 5));
        // graph[2].add(new Edge(2, 6));

        // graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 6));
        // graph[3].add(new Edge(3, 7));

        // graph[4].add(new Edge(4,5));

        // graph[6].add(new Edge(6, 7));
    }

    public static void topologicalSort(ArrayList<Edge>[] graph) {
        boolean visit[] = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if(!visit[i]){
                topologicalSortUtil(graph, i, visit, stack);
            }
            
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static void topologicalSortUtil(ArrayList<Edge>[]graph,int curr,boolean visit[],Stack<Integer>s){
        visit[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                topologicalSortUtil(graph, e.dest, visit, s);
            }
        }
        s.push(curr);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topologicalSort(graph);
    }
}
