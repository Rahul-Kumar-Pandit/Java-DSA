package Hashing.HashSet;

import java.util.TreeSet;

import java.util.Iterator;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Giridih");
        ts.add("Dhanbad");
        ts.add("Koderma");
        ts.add("Bokaro");
        ts.add("ArunachalPradesh");
        
        System.out.println(ts);
        Iterator<String> it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
