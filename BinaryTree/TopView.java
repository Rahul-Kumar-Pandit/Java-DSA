package BinaryTree;

import java.util.*;
public class TopView {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        int hd;         // hd --> Horizontal distance 
        Node node;
        public Info(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        // level Wise Traversal
        int min = 0, max = 0;
        Queue<Info> q = new LinkedList<>();

        HashMap<Integer,Node> map = new HashMap<>();
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            // null condition 
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                // first time my hd is occuring 
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node); //(key,value) (key value pair)
                }

                // if root node.left not equal to null then
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }

                // if root node.right not equal to null then 
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max = Math.max(max,curr.hd+1);
                }
            }
        }

        // Print top view 
        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
/* 
             1
           /   \
          2     3
           \ 
            4
             \ 
              5 
               \ 
                6

*/
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        topView(root);

    }
}



