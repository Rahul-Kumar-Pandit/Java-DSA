package LinkedList;

public class AddFirst {
    public static class Node{
        int data;   
        Node next;  // Object (reference pointer)
        public Node(int data){  // Constructor 
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add First 
    public void addFirst(int data){
        // Step 1 :- Create a new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        // Step 2 :- new node's next = head
        newNode.next = head;
        // Step 3 :- head = newNode
        head = newNode;
    }


    // Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }



    // Print Function
    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("Linked list is empty ");
            return;
        }
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    } 


    public static void main(String[] args) {
        
    }
}
