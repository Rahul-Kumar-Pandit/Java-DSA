package BinarySearchTree;

public class AVLTree {
    static class Node {
        int data, height;
        Node left, right;

        public Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Right Rotate Subtree rooted with Y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // perform rotation
        x.right = y;
        y.left = T2;

        // Update height
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // return new root
        return x;
    }

    // Left Rotation
    public static Node leftRoatate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update height
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // return new root
        return y;
    }

    // Insert Function
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root; // Duplicate not allowed
        }

        // Update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // get Root's balance factor
        int bf = getBalance(root);

        // LL Case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // RR Case
        if (bf < -1 && key > root.right.data) {
            return leftRoatate(root);
        }

        // LR Case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRoatate(root.left);
            return rightRotate(root);
        }

        // RL Case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRoatate(root);
        }

        return root; // return if AVL balanced
    }

    // Get Balance
    public static int getBalance(Node root) {
        if (root == null) {
            return 0;
        }

        return (height(root.left) - height(root.right));
    }


    // preOrder
    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40); 
        root = insert(root, 50);
        root = insert(root, 25);

        /* ------------------ AVL BST ---------
                30
               /  \
             20    40
            /  \     \
           10   25    50
           
           

         */

        preOrder(root);
    }
}
