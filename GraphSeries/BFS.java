package GraphSeries;

import java.util.*;

public class BFS {
    public static List<Integer> bfs(int node, List<List<Integer>> list) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[node];
        for(int i=0; i<node; i++){
            if(!visited[i]){
                bfsUtil(i, queue, visited, result, list);
            }
        }
        return result;
    }

    public static void bfsUtil(int node,Queue<Integer> queue,boolean visited[],List<Integer> result,List<List<Integer>> list){
        visited[node] = true;
        queue.add(node);
        while(!queue.isEmpty()){
            int vertex = queue.remove();
            result.add(vertex);
            for(int neighbor : list.get(vertex)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = { { 1, 2 }, { 4, 1 }, { 1, 8 }, { 2, 3 }, { 0, 2 }, { 6, 0 }, { 7, 0 }, { 5, 7 } };
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <=edges.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }

        List<Integer> res = bfs(9, list);
        for(int i=0; i<res.size(); i++){
            System.out.print(res.get(i)+" ");
        }
        System.out.println();
    }
}
