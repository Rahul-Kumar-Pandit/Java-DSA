// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Operation

        list.add(1);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(-4);

        System.out.println(list);

        // Get Operation
        // System.out.println(list.get(1));

        // Remove Operation
        // list.remove(2);
        // System.out.println(list);

        // Set element at index
        // list.set(2, 10);
        // System.out.println(list);

        // Contains element
        // Contain means the element is in the list or not
        // System.out.println(list.contains(2));
        // System.out.println(list.contains(14));

        // Size of arrayList
        // System.out.println(list.size());

        // Print ArrayList value
        /*
         * for(int i=0; i<list.size(); i++){
         * System.out.print(list.get(i)+" ");
         * }
         */

        // Print List in reverse Order
        /*
         * System.out.println("\nList in Reverse Order");
         * for(int i=list.size()-1; i>=0; i--){
         * System.out.print(list.get(i)+" ");
         * }
         */

        // Find the maximum value in the array list
        /*
         * int max = Integer.MIN_VALUE;
         * for(int i=0; i<list.size(); i++){
         * if(max<list.get(i)){
         * max = list.get(i);
         * 
         * }
         * }
         * System.out.println("max element = "+ max);
         */

        // Find the Minimum value in the array list
        /*
         * int min = Integer.MAX_VALUE;
         * for(int i=0; i<list.size();i++){
         * if(min>list.get(i)){
         * min = list.get(i);
         * }
         * }
         * System.out.println("min element = "+min);
         */

        // ************* Swap two numbers in the array list ***********
        /*
         * int idx1 = 1,idx2 = 3;
         * swap(list, idx1, idx2);
         * System.out.println("After Swaping");
         * System.out.println(list);
         */

        // ********** Sorting in ArrayList ************
       /*  Collections.sort(list);
        System.out.println("Sorted in Ascending order : ");
        System.out.println(list);

        // Sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted in Descending order : ");
        System.out.println(list); */

    
    }

    // Swap function
    /*
     * public static void swap(ArrayList<Integer> list, int idx1,int idx2){
     * int temp = list.get(idx1);
     * list.set(idx1,list.get(idx2));
     * list.set(idx2, temp);
     * }
     */
}
