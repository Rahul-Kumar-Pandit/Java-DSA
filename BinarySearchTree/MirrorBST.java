package BinarySearchTree;

public class MirrorBST {
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

    public static Node mirrorofBST(Node root) {
        if (root == null) {
            return null;
        }

        Node leftNode = mirrorofBST(root.left);
        Node rightNode = mirrorofBST(root.right);

        root.left = rightNode;
        root.right = leftNode;
        return root;
    }

    // For print Mirror Node
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);

        preOrder(root);
        System.out.println();
        mirrorofBST(root);
        preOrder(root);
    }
}
