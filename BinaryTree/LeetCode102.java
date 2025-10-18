package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class LeetCode102 {
    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
        
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {  
    List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            TreeNode curr = queue.remove();
            if(curr == null){
                if(queue.isEmpty()){
                    break;
                }else{
                    result.add(list);
                    queue.add(null);
                }
            }else{
                list.add(curr.val);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            
        }
        return result;
    }


   public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.left.right = new TreeNode(5);
        List<List<Integer>> result = new ArrayList<>();
        result = levelOrder(root);
        System.out.println(result);
   } 
}