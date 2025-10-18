package BinarySearchTree;

import java.util.ArrayList;

public class ConvertBSTtoBalancedBST {
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

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int si, int ei) {
        if (si > ei) {
            return null;
        }

        int mid = si + (ei - si) / 2;
        Node rootNode = new Node(inorder.get(mid));
        rootNode.left = createBST(inorder, si, mid - 1);
        rootNode.right = createBST(inorder, mid + 1, ei);
        return rootNode;
    }

    public static Node balancedBST(Node root) {
        // inOrder Sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // Sorted Inorder ArrayList --> Balance BST
        root = createBST(inorder, 0, inorder.size() - 1);
        return root;
    }

    public static void main(String[] args) {
        
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        /* --- Expected Output ---
                    8
                  /  \  
                 5    11
                / \   / \
               3  6 10  12
         */
        preOrder(root);
        System.out.println();
        root = balancedBST(root);

        preOrder(root);

    }
}
