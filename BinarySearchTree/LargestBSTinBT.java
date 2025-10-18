package BinarySearchTree;

public class LargestBSTinBT {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class Info {
        boolean isBST;
        int size;
        int minVal;
        int maxVal;

        public Info(boolean isBST, int size, int minVal, int maxVal) {
            this.isBST = isBST;
            this.size = size;
            this.minVal = minVal;
            this.maxVal = maxVal;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }


        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        // 1. Size 
        int size = leftInfo.size + rightInfo.size + 1;

        // 2. Min 
        int min = Math.min(root.data,Math.min(leftInfo.minVal,rightInfo.minVal));
        // 3.max
        int max = Math.max(root.data,Math.max(leftInfo.maxVal,rightInfo.maxVal));

        // Check isValid condition
        if(root.data <= leftInfo.maxVal || root.data >= rightInfo.minVal){
            return new Info(false,size,min,max);
        }

        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        root.right.right.left = new Node(65);

        largestBST(root);
        System.out.println("Largest BST size = "+maxBST);
    }
}