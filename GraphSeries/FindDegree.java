package GraphSeries;

public class FindDegree {
    public static void findDegree(int[][]edges,boolean isDirected,int node){
        int inDegree[] = new int[node];
        int outDegree[] = new int[node];
        int degree[]  = new int[node];
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];

            if(isDirected){
                inDegree[v]++;
                outDegree[u]++;
            }else{
                degree[u]++;
                degree[v]++;
            }
        }
        printInDegree(inDegree);
        printoutDegree(outDegree);
    }
    public static void printInDegree(int[]inDegree){
        for(int i=0; i<inDegree.length; i++){
            System.out.print(inDegree[i]+" ");
        }
        System.out.println();
    }
    public static void printoutDegree(int[]outDegree){
        for(int i=0; i<outDegree.length; i++){
            System.out.print(outDegree[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 4;
        int edges[][] = {{0,1},{0,2},{1,3}};
        findDegree(edges, true, n);
    }
}
