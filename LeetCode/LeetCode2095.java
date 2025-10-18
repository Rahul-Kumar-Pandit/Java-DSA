package LeetCode;

public class LeetCode2095 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;    // +1
            fast = fast.next.next;  // +2
        }
        return slow;    // slow is my mid node
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.next = new Node(3);
        root.next.next = new Node(4);
        root.next.next.next = new Node(7);
        root.next.next.next.next = new Node(6);
        root.next.next.next.next.next = new Node(2);
        root.next.next.next.next.next.next = new Node(9);

        Node Prev = findMid(root);
        System.out.println(Prev.data);

    }
}
