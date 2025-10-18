package BinarySearchTree;

import java.util.ArrayList;

public class Merge2BST {
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


    // ----------------------------------- Inorder Function ------------------------------
    public static void getInOrder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInOrder(root.left, inorder);
        inorder.add(root.data);
        getInOrder(root.right, inorder);
    }



    // --------------------------------- Merger Two BST in a Sorted Way -----------------------

    public static Node mergeBSTs(Node root1, Node root2) {
        // Inorder sequence of BST1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInOrder(root1, arr1);

        // Inorder sequence of BST2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInOrder(root2, arr2);



        // merge arr1 and arr2
        int i = 0, j = 0;
        ArrayList<Integer> sortedArr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                sortedArr.add(arr1.get(i));
                i++;
            } else {
                sortedArr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            sortedArr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            sortedArr.add(arr2.get(j));
            j++;
        }
        // Sorted ArrayList  --> Balanced BST
        return merger2BSTs(sortedArr, 0, sortedArr.size()-1);
    }


    // ---------------------- Create Balanced BST ----------------------------
    public static Node merger2BSTs(ArrayList<Integer> sortedArr, int si, int ei) {
        if (si > ei) {
            return null;
        }

        int mid = si + (ei - si) / 2;
        Node newNode = new Node(sortedArr.get(mid));
        newNode.left = merger2BSTs(sortedArr, si, mid - 1);
        newNode.right = merger2BSTs(sortedArr, mid + 1, ei);
        return newNode;
    }

    // -------------------- PreOrder Function --------------------
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        /*
         * -------- BST 1 ---------
                     
                      2
                     / \
                    1  4
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
         * -------- BST 2 ---------
                 
                  9
                 / \
                3  12
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preOrder(root);
    }
}
