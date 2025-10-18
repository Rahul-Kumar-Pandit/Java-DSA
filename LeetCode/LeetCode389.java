package LeetCode;

public class LeetCode389 {

    public static void main(String[] args) {
        String s = "abcdbgacz";
        // String t = "abcdea";
        int[]freq1 = new int[26];
        int[]freq2 = new int[26];
       
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i)-'a';
            freq1[idx]++;
        }
        for(int i=0; i<freq2.length; i++){
            System.out.print(freq1[i]+" ");
        }
        
    }
}