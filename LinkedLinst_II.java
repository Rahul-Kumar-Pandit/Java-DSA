public class LinkedLinst_II {
    public static class Node {
        int data; 
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // Add Node from first 
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print Linked list
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // Detect a loop/Cycle in linke list
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }


    // REMOVE A LOOP/CYCLE IN A LINKED LIST
    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycle = true;
                break;
            }
        }
        
        if(cycle == false){
            return;
        }

        // find mitting point 
        slow = head;
        Node prev = null;       
        while (fast != slow) {
            prev = fast;        // This is tracking my last node
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle --> last.next = null;
        prev.next = null;
    }
    public static void main(String[] args) {

       head = new Node(1);
       Node temp = new Node(2);
       head.next = temp;
       head.next.next = new Node(3);
       head.next.next.next = temp;
       System.out.println(isCycle());
       removeCycle();
       System.out.println(isCycle());
    }
}
