package LeetCode;
import java.util.*;
public class LeetCode1508 {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            int start = i;
            for(int j=i; j<nums.length; j++){
                int end = j;
                int currSum = 0;
                for(int k = start; k<=end; k++){
                    currSum += nums[k];
                }
                arr.add(currSum); 
            }
        }
        
        int result[] = new int[arr.size()];
        for(int i=0; i<result.length; i++){
            result[i] = arr.get(i);
        }
        Arrays.sort(result);
        int ans = 0;
        
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int result = rangeSum(arr, 4, 1, 5);
        System.out.println(result);
    }
}

