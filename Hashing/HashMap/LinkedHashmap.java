package Hashing.HashMap;

import java.util.*;
public class LinkedHashmap {

    public static void main(String[] args) {
        // It follows insertion order
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("UnitedState", 50);

        System.out.println(lhm);
        // System.out.println(hm.get("India"));

        System.out.println(lhm.remove("China"));
        System.out.println(lhm);
    }
}
