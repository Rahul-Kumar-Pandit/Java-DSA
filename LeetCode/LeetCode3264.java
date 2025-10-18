package LeetCode;

import java.util.PriorityQueue;

public class LeetCode3264 {
    public static int[] getFinalState(int[] nums, int k, int multiplier){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[0]==b[0])return a[1]-b[1];
            return a[0]-b[0];
        });
        for(int i=0; i<nums.length; i++){
            pq.offer(new int[]{nums[i], i});
        }
        while(k>0){
            int[]arr = pq.poll();
            nums[arr[1]] = nums[arr[1]] * multiplier;
            pq.offer(new int[]{nums[arr[1]],arr[1]});
            k--;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[]nums = {2,1,3,5,6};
        int k = 5, multiplier = 2;
        int[]result = getFinalState(nums, k, multiplier);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}