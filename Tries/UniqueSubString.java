package Tries;

public class UniqueSubString {
    static class Node{
        Node children[] = new Node[26];
        boolean endOfWord = false;

        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';

            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }

    public static void subString(String str){
        for(int i=0; i<str.length(); i++){
            str.substring(i);
        }
    }

    public static int countNodes(Node root){
        int counter = 0;
        if(root == null){
            return 0;
        }

        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                counter += countNodes(root.children[i]);
            }
        }

        return counter+1;
    }
    public static void main(String[] args) {
        String str = "ababa";

        // Suffix  --> insert
        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNodes(root));
    }
}
