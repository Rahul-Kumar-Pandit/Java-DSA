package GraphSeries;
import java.util.ArrayList;
import java.util.List;
public class CreateAjdList {
    class Pair{
        int node;
        int wt;
        Pair(int n,int w){
            node = n;
            wt = w;
        }
        @Override
        public String toString(){
            return "(" + node + "," + wt + ")";
        }
    }
    List<List<Integer>> list;
    List<List<Pair>> listWithWt;
    CreateAjdList(int node){
        list = new ArrayList<>();
        listWithWt = new ArrayList<>();
        for(int i=0; i<node; i++){
            list.add(new ArrayList<>());
            listWithWt.add(new ArrayList<>());
        }
    }
    public void addEdgesInList(int[][] edges,boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            
            if(isDirected){
                // Directed
                list.get(u).add(v);
            }else{
                // undirected graph
                list.get(u).add(v);
                list.get(v).add(u);
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
                Pair pair = new Pair(v, wt);
                listWithWt.get(u).add(pair);
                
            }else{
                // undirected graph
                Pair pair1 = new Pair(v, wt);
                Pair pair2 = new Pair(u, wt);
                listWithWt.get(u).add(pair1);
                listWithWt.get(v).add(pair2);
            }
            
        }
    }

    public void printList(){
        for(int i=0; i<list.size(); i++){
            System.out.print(i + " -> "+"[");
            for(int j=0; j<list.get(i).size(); j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public void printWtList(){
        for(int i=0; i<listWithWt.size(); i++){
            System.out.print(i + " -> "+"[");
            for(int j=0; j<listWithWt.get(i).size(); j++){
                System.out.print(listWithWt.get(i).get(j));
                if(j!=listWithWt.get(i).size()-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int edges[][] = {{0,1,10},{0,2,20},{1,3,30}};
        CreateAjdList graph = new CreateAjdList(n);
        System.out.println("------------------- Directed Graph -----------------------------");
        graph.addEdgesWithWeightInMatrix(edges, true);
        graph.printWtList();
        System.out.println("------------------- UnDirected Graph -----------------------------");
        graph.addEdgesWithWeightInMatrix(edges, false);
        graph.printWtList();
    }
}
