package Heaps;

import java.util.ArrayList;

public class Insert {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index
            arr.add(data);

            int x = arr.size() - 1; // Child Node index (which is my new node)
            int parent = (arr.size() - 2) / 2; // (parent Node index) arr.size()-1-1/2 --> arr.size()-2/2

            while (arr.get(x) < arr.get(parent)) {
                // Swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x-1)/2;
            }
        }

        // Peek
        public int peek() {
            return arr.get(0);
        }

        // Heapify function
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                // Swap
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx, temp);


                heapify(minIdx);
            }
        }

        // remove
        public int remove() {
            int data = arr.get(0);

            // Step 1 -> Swap 1st & last Node
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Step 2 -> remove last Node
            arr.remove(arr.size() - 1);

            // Step 3 -> fix my arrayList (heapify)

            heapify(0);
            return data;
        }


        // isEmpty
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
