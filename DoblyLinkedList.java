
public class DoblyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    // Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add Last 
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Print 
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        if(head != null){
            System.out.print("null");
        }
        System.out.println();
    }

    // Remove First
    public void removeFirst(){
        if(head == null ){
            System.out.println("Linked list is empty");
            return;
        }
        if(head.next == null){
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Remove last
    public void removeLast(){
        if(head == null ){
            System.out.println("Linked list is empty");
            return;
        }
        if(head.next == null){
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }


    // Reverse Doubly Linked List
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

        public static void main(String[] args) {
        DoblyLinkedList dll = new DoblyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.print();

        // Remove Method 
        // dll.removeFirst();
        // dll.removeLast();


        // Reverse Function 
        dll.reverse();
        dll.print();
    }
}
