public class LinkedListMergeSort {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = tail = newNode;
           return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Print linked list
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node head;
    public static Node tail;




    // Find Middle 
    private Node getMidNode(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }




    // Merge Function 
    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        // rest element in left half
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        // rest element in right half
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }



    //Question :-  Merge Sort using linked list

    public Node mergeSort(Node head){
        // Base Case
        if(head == null || head.next == null){
            return head;
        }
        // Find mid 
        Node midNode = getMidNode(head);

        // Left half & right half
        Node righthead = midNode.next;
        midNode.next = null;
        Node newLeft = mergeSort(head);    // Called for left half
        Node newRight = mergeSort(righthead);      // Called for right half
        // Merge
        return merge(newLeft, newRight);
    }





    // Question Zig-Zag linked list
    public void zigZag(){
        // Find middle 
        Node mid = getMidNode(head);

        // 2nd half reverse 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        // alternate merging ---> zig-zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            // Update --> left & right
            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args) {
      LinkedListMergeSort ll = new LinkedListMergeSort();
      ll.addFirst(5);
      ll.addFirst(4);
      ll.addFirst(3);
      ll.addFirst(2);
      ll.addFirst(1);
      ll.print();

        //  For merge Sort    
        //    ll.head = ll.mergeSort(head);
        //    ll.print();

        // For Zig-Zag
        ll.zigZag();
        ll.print();
    }
}
