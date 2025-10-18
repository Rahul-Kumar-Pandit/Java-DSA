package LeetCode;
import java.util.*;
public class LeetCode2976 {
    public static class Edge{
        char a,b;
        int wt;
        public Edge(char a,char b,int wt){
            this.a = a;
            this.b = b;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge>[]graph,char[]original,char[]changed,int[]cost){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        int n = original.length;
        for(int i=0; i<n; i++){
            
            graph[i].add(new Edge(original[i],changed[i],cost[i]));
        }
    }
    public static long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        
        return 0;
    }
    public static void main(String[] args) {
       
    }
}


