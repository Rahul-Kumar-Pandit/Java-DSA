package BinarySearchTree;

public class DeleteNode {
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

    public static Node deleteNode(Node root, int val) {
        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else {
            // CASE 1:- No Child (leaf Node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // CASE 2 :- One Child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // CASE 3 :- Two Children

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        // left most node in Right Subtree
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    // It always gives a sorted BST
    public static void inOrder(Node root){
        if(root == null){
            return;

        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.right = new Node(6);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        inOrder(root);
        System.out.println();
        deleteNode(root, 5);
        inOrder(root);
    }
}
