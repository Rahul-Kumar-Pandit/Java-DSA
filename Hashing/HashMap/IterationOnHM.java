package Hashing.HashMap;

import java.util.HashMap;
import java.util.Set;

public class IterationOnHM {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 200);
        hm.put("Nepal", 5);
        hm.put("UnitedState", 50);
        hm.put("Indonesia", 10);

        Set<String> keys = hm.keySet();
        System.out.println(keys);
        System.out.println();

        // Foreach loop
        for (String k : keys) {
            System.out.println("Key = "+k+",Value : "+hm.get(k));
        }
    }
}
