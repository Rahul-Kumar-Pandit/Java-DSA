package LeetCode;

import java.util.HashSet;

public class LeetCode26 {
    public static int removeDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int[]result = new int[set.size()];
        int idx=0; 
        for(int num : set){
            result[idx++] = num;
        }
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");

        }
        System.out.println();
        return 0;
    }

    public static void main(String[] args) {
        int[]nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println();
        System.out.println(removeDuplicates(nums));
    }
}