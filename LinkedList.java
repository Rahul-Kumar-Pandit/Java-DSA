public class LinkedList {
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



    // Add in the Middle
    public void addMiddle(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        // i = index-1 : temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }



    // Remove First 
    public int removeFirst(){
        if(head==null){ // If no node present in linked list
            System.out.println("Linked list is empty ");
            return Integer.MIN_VALUE;
        }else if(head.next==null){  // if we have a single node
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // Remove condition
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    // Remove Last
    public int removeLast(){
        if(head==null){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }else if(head.next==null){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // Find Prev node
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = tail.data;        // prev.next.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    // Search(Iterative)        // Linear Search perform 
    public int searchItem(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){       // Element found case 
                return i;
            }
            temp = temp.next;
            i++;
        }

        // Element not found case 
        return -1;
    }



    // Recursive Search 
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }



    // REVERSE LINKED LIST 
    public void reverse(){
        Node prevNode = null;
        Node currNode = tail = head;
        Node nextNode;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }



    // REMOVE Nth NODE FORM END
    public void removeNthFormEnd(int n){
        // Calculte size 
        int sz = 0;     // size (sz)
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n==sz){     // head node
            head = head.next;   //remove first Condition occurs 
            return;
        }

        int i = 1;
        int idxTofind = sz - n;
        Node prev = head;
        while (i<idxTofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // ll.addMiddle(2, 9);
        // ll.addMiddle(0, 10);
        ll.print();


        // System.out.println(size);
        // int val = ll.removeFirst();
        // System.out.println("Deleted Element : "+val);
        // ll.removeLast();
        // ll.print();

        // Iterative Search 
        // System.out.println(ll.searchItem(2));
        // System.out.println(ll.searchItem(15));

        // Recursive Search 
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(17));

        // REVERSE LINKED LIST
        ll.reverse();
        ll.print();


        // Delete Nth node from the end 
        // ll.removeNthFormEnd(5);
        // ll.print();
    }
}



// [1,2,3,4,5]