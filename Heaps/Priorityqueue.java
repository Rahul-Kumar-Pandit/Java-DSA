package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priorityqueue {
    
    public static void main(String[] args) {
        // It gives more priority to smaller values

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(7);
        pq.add(3);
        pq.add(1);
        pq.add(4);
        pq.add(9);

        while(!pq.isEmpty()){
            System.out.print(pq.peek() +" ");
            pq.remove();
        }
        System.out.println();


        // If I want that, They give more priority to bigger value then,
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(7);
        pq2.add(3);
        pq2.add(1);
        pq2.add(4);
        pq2.add(9);

        while(!pq2.isEmpty()){
            System.out.print(pq2.peek() +" ");
            pq2.remove();
        }



    }
}
