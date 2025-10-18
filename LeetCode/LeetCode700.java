package LeetCode;
import java.util.*;

public class LeetCode700 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean search(TreeNode root, int key) {
        if (root == null) {
            return false;
        }

        if (root.val == key) {
            return true;
        } else if (root.val > key) {
            // seach in left side of binary tree
           return search(root.left, key);
        } else {
           return search(root.right, key);
        }
    }

    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void preOrder(TreeNode root){
        if(root == null){
            return;
        }

        arr.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static ArrayList<Integer> searchBST(TreeNode root, int val) {
        
        if(search(root,val)){
            TreeNode curr = root;
            preOrder(curr);
        }
        
        return arr;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(5);

      ArrayList<Integer> arr = searchBST(root, 2);
      for(int i=0; i<arr.size(); i++){
        System.out.print(arr.get(i)+" ");
      }
    }
    
}    

