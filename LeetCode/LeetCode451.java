package LeetCode;

public class LeetCode451 {
    public static String frequencySort(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]!=0){
                System.out.println(freq[i]);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        frequencySort("tree");
    }
}
