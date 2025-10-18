package Hashing.HashSet;

import java.util.LinkedHashSet;

// import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.Iterator;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        // LinkedHashSet follows (FIFO) sequence order to print
        cities.add("Chandigarh");
        cities.add("Hazaribagh");
        cities.add("Ranchi");
        cities.add("Haryana");
        cities.add("New Delhi");

        Iterator<String> it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
