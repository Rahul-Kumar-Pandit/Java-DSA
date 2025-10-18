package Heaps;
import java.util.PriorityQueue;
public class KNearest {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distanceSqre;
        int index;

        public Point(int x,int y,int distanceSqre,int index){
            this.x = x;
            this.y = y;
            this.distanceSqre = distanceSqre;
            this.index = index;
        }

        @Override
        public int compareTo(Point p2){
            return this.distanceSqre - p2.distanceSqre;
        }
    }
    public static void main(String[] args) {
        int points[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<points.length; i++){
            int distanceSqre = points[i][0]*points[i][0] + points[i][1]*points[i][1];

            pq.add(new Point(points[i][0], points[i][1], distanceSqre,i));
        }

        // k nearest
        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().index);
        }
    }
}