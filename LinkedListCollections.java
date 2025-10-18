import java.util.LinkedList;
public class LinkedListCollections {
    public static void main(String[] args) {
        // Create 
        LinkedList<Integer> ll = new LinkedList<>();

        // Add Nodes in a linked list
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(6);
        ll.addFirst(0);
        System.out.println(ll);

        // remove linked list
        ll.removeFirst();
        ll.removeLast();
        ll.remove(2);
        System.out.println(ll);

    }
}
