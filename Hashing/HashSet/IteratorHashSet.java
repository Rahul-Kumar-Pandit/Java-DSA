package Hashing.HashSet;

import java.util.*;

public class IteratorHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Noida");
        cities.add("Punjab");
//  ------------------------------- Using Iterator --------------------
        Iterator<String> it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }

//  ------------------------------ Using foreach ------------------------
        System.out.println("\n");
        for(String city : cities){
            System.out.println(city);
        }

    }
}
