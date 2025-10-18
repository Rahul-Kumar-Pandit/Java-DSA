package GraphSeries;

public class CreateAdjMatrix {
    int adjMatrix[][];

    CreateAdjMatrix(int nodes) {
        adjMatrix = new int[nodes][nodes];
    }

    public void addEdgesInMatrix(int[][] edges,boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            
            if(isDirected){
                // Directed
                adjMatrix[u][v] = 1;
            }else{
                // undirected graph
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
            
        }
    }

    public void addEdgesWithWeightInMatrix(int[][] edges,boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            
            if(isDirected){
                // Directed
                adjMatrix[u][v] = wt;
            }else{
                // undirected graph
                adjMatrix[u][v] = wt;
                adjMatrix[v][u] = wt;
            }
            
        }
    }


    public void printMatrix(){
        for(int i=0; i<adjMatrix.length; i++){
            for(int j=0; j<adjMatrix[0].length; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        /* 
        int edges[][] = {{0,1},{0,2},{1,3}};
        CreateAdjMatrix graph = new CreateAdjMatrix(n);
        graph.addEdgesInMatrix(edges,false);
        graph.printMatrix();
        */

        int Edges[][] = {{0,1,10},{0,2,20},{1,3,30}};
        CreateAdjMatrix graph = new CreateAdjMatrix(n);
        graph.addEdgesWithWeightInMatrix(Edges, false);
        graph.printMatrix();
    }
}
