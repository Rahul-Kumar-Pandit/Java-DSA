package LeetCode;

import java.util.*;

class LeetCode43 {
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
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        rootToLeaf(root,new ArrayList<>(),targetSum);
        return res;
    }

    public static void rootToLeaf(TreeNode root,ArrayList<Integer>path,int targetSum){
        if(root == null){
            return;
        }

        path.add(root.val);
        if(root.left == null && root.right == null){
            calCulate(path,targetSum);
            // printNode(path);
        }

        rootToLeaf(root.left,path,targetSum);
        rootToLeaf(root.right,path,targetSum);

        path.remove(path.size()-1);
    }

    public static void calCulate(ArrayList<Integer> path,int targetSum){
        int sum = 0;
        for(int i=0; i<path.size(); i++){
            sum += path.get(i);
        }

        if(sum == targetSum){
            res.add(path);
            // printNode(path);
        }

    }

    public static void printNode(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+" ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.right = new TreeNode(2);
        root.left.left.left = new TreeNode(7);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        // List<List<Integer>> ans = new ArrayList<>();
        // ans = pathSum(root,22);

        // rootToLeaf(root,new ArrayList<>(),22);
        // printNode(null);

        
    }
}
