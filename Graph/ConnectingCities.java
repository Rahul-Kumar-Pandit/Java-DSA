package Graph;

import java.util.PriorityQueue;

public class ConnectingCities {
    static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        public Edge(int dest,int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e2){
            return this.cost - e2.cost;
        }
    }

    public static int connectCities(int cities[][]) {
        boolean visit[] = new boolean[cities.length];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(0, 0));
        int minCost = 0;
        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            if (!visit[curr.dest]) {
                visit[curr.dest] = true;
                minCost += curr.cost;

                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if(cities[curr.dest][i] != 0){
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }

            }
        }

        return minCost;
    }

    public static void main(String[] args) {
        int cities[][] = { { 0, 1, 2, 3, 4 },
                            { 1, 0, 5, 0, 7 },
                            { 2, 5, 0, 6, 0 },
                            { 3, 0, 6, 0, 0 },
                            { 4, 7, 0, 0, 0 } };
       System.out.println("Minmum cost to connect all cities = "+connectCities(cities));
    }
}
