package Heaps;

import java.util.PriorityQueue;

public class PQforObject {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;

        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        
        pq.add(new Student("Anish", 5));
        pq.add(new Student("Rahul", 1));
        pq.add(new Student("Satish", 43));
        pq.add(new Student("Ritesh", 12));
        pq.add(new Student("Sandeep", 7));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" -> "+ pq.peek().rank);
            pq.remove();
        }
    }
}
