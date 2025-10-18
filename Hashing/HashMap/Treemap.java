package Hashing.HashMap;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        
        tm.put("India", 100);
        tm.put("China",200);
        tm.put("UnitedState", 50);
        tm.put("Nepal",5);

        System.out.println(tm);
    }
}
