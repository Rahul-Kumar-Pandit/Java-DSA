package BinaryTree;

// import java.util.LinkedList;

// import java.util.Queue;

public class SumOfLeftLeaves {
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static class Pair{
        int val;
        boolean isLeftChild;
        public Pair(int val,boolean isLeftChild){
            this.val = val;
            this.isLeftChild = isLeftChild;
        }
    }

    // public static int sumofLeftLeaves(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    // }
    // public static int getSum(Node root,boolean isLeftChild){
    //     Queue<Pair> q = new LinkedList<>();
        
    //     q.add(new Pair(root.val, isLeftChild));

    //     if(root.left != null){
    //         q.add(new Pair(root.val, isLeftChild));
    //     }
    // }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
    }    
}