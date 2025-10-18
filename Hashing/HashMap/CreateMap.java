package Hashing.HashMap;

import java.util.HashMap;

public class CreateMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Pakistan", 5);
        hm.put("Nepal", 7);
        hm.put("United State", 50);

        System.out.println(hm);

        // Get O(1)
        int population = hm.get("India");
        System.out.println(population);
        // If my key does not exist in the map it return *NULL* value
        System.out.println(hm.get("Delhi"));


        // containsKey --> O(1)
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Hydrabad")); // false


        // Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // Size()
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());

        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
