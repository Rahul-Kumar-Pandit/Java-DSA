public class LinkedListPalindrome {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail; 
    
    // Add First 
    public void addFirst(int data){
        // Step 1 :- Create a new node
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        // Step 2 :- new node's next = head
        newNode.next = head;
        // Step 3 :- head = newNode
        head = newNode;
    }



    // Add data in the linke list (add form last )
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print Linked list node
    public void print(){
        if(head==null){
            System.out.println("Linked list is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    // Check if linked list is a Palindrome 
    // Slow - Fast Approach 
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;    // +1
            fast = fast.next.next;  // +2
        }
        return slow;    // slow is my mid node
    }

    public boolean checkPalindrome(){
        if(head==null || head.next == null){
            return true;
        }
        // Step - 1 :- Find middle Node 
        Node midNode = findMid(head);

        // Step 2 :- Reverse half node
        Node prevNode = null;
        Node currNode = midNode;
        Node nextNode;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        
        Node right = prevNode;  //right half head
        Node left = head;   // left half head
        // // compare left half & right half
        while (right != null) {
            if(left.data != right.data){
                return false;
            }    
            left = left.next;
            right = right.next;    
        }
        return true;
        
    }
    
    public static void main(String[] args) {
        LinkedListPalindrome ll = new LinkedListPalindrome();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);
        ll.print();
       System.out.println( ll.checkPalindrome());
    }
}
