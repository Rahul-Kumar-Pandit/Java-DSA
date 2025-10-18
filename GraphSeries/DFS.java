package GraphSeries;

import java.util.ArrayList;
import java.util.List;

public class DFS { 
    public static List<Integer> dfsOfGraph(int node,List<List<Integer>>list){
        List<Integer> result = new ArrayList<>();
        boolean[]visited = new boolean[node];
        for(int i=0; i<node; i++){
            if(!visited[i]){
                dfs(i,visited,list,result);
            }
        }
        return result;
    }

    public static void dfs(int node,boolean[]visited,List<List<Integer>>list,List<Integer>res){
        visited[node] = true;
        res.add(node);
        for(int neighbor : list.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor,visited,list,res);
            }
        }
    }
    public static void main(String[] args) {
        int[][] edges = {{1,2},{4,1},{1,8},{2,3},{0,2},{6,0},{7,0},{5,7}};
        // Create AdjList
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<9; i++){
            list.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        // DFS graph = new DFS(9);
        // graph.createAdjList(edges);
        List<Integer> result = dfsOfGraph(9,list);
        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i)+" ");
        }
    }
}
