package Hashing.HashSet;

import java.util.HashSet;

public class Operations {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(3);
        hs.add(4);
        hs.add(6);
        hs.add(6);
        hs.add(8);
        hs.add(12);
        System.out.println(hs);

        hs.remove(3);
        if(hs.contains(3)){
            System.out.println("Set contains 3");
        }
        if(hs.contains(1)){
            System.out.println("Set constains 1");
        }

        System.out.println(hs.size());
    }
}
