package LeetCode;
import java.util.*;
public class LeetCode771 {
    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<stones.length(); i++){
            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);
        }
        
        int result = 0;
        for(int i=0; i<jewels.length(); i++){
            if(map.containsKey(jewels.charAt(i))){
                result += Math.max(result,map.get(jewels.charAt(i)));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
class Solution {
    
}
