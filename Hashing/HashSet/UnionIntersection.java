package Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;


public class UnionIntersection {
    public static int union(int arr1[],int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            hs.add(arr2[i]);
        }

        // Print value
        Iterator<Integer> it = hs.iterator();
        System.out.print("Union Elements : ");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();


        return hs.size();
    }

    public static int intersection(int arr1[],int arr2[]){
        int count =0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

        System.out.print("Intersection Elements : ");
        for(int i=0; i<arr2.length; i++){
            if(hs.contains(arr2[i])){
                count++;
                System.out.print(arr2[i]+" ");
               hs.remove(arr2[i]);
            }
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        
        System.out.println("Union : "+union(arr1, arr2));
        System.out.println("Intersection : "+intersection(arr1, arr2));
    }
}
