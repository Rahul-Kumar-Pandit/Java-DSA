package LeetCode;

public class LeetCode2370 {
    public static void main(String[] args) {
        String s = "acfbd";
        // int k = 2;
        // int count=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int diff = (int)(ch-'a');
            System.out.println(diff);
            // if(diff <= k){
            //     count++;
            // }
        }
        // System.out.println(count);
    }
}
