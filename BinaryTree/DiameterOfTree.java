package BinaryTree;

/* 
public class DiameterOfTree {
    // Node class 
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Calculate Height of a tree 
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight)+1;

    }

    // Calculate diameter of a tree
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        // left diameter and left height
        int leftDiameter = diameter(root.left);
        int leftHt = height(root.left);

        // right diameter and right height 
        int rightDiameter = diameter(root.right);
        int rightHt = height(root.right);

        // seft diameter means (root node diameter)
        int selfDiameter = leftHt + rightHt + 1;

        return Math.max(selfDiameter,Math.max(rightDiameter, leftDiameter));
    }
    public static void main(String[] args) {
        
                    1
                   / \
                  2   3
                /  \    \
               4    5    6
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Diameter of this tree is : "+diameter(root));
    }
}
 */


// Second Approach

public class DiameterOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Information{
        int diam;
        int height;
        public Information(int diam,int height){
            this.diam = diam;
            this.height = height;
        }
    }
    public static Information diameter(Node root){
        if(root == null){
            return new Information(0, 0);
        }
        Information leftInfo = diameter(root.left);
        Information rightInfo = diameter(root.right);

        int finalDiameter = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.height + rightInfo.height+1);

        int finalHeight = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Information(finalDiameter,finalHeight);
    }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Diameter of a Binary tree : "+diameter(root).diam);

        System.out.println("Height of a given Binary Tree : "+diameter(root).height);
    }
}
