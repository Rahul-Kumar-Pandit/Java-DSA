package LeetCode;

import java.util.Arrays;

public class LeetCode238 {
    public static void main(String[] args) {
        // TC : O(n^2)
        // int nums[] = {1,2,3,4};
        // int nums[] = {-1,1,0,-3,3};
        // int val = 1;
        // int result[] = new int[nums.length];
        // int k=0;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=0; j<nums.length; j++){
        //         if(i==j){
        //             continue;
        //         }else{
        //             val *= nums[j];
        //         }
        //     }
        //     result[k++] = val;
        //     val = 1; 
        // }




        // Approach 2 

        /* int nums[] = {1,2,3,4};
        int pre[] = new int[nums.length];
        int suff[] = new int[nums.length];
        pre[0] = 1;
        suff[nums.length-1] = 1;

        for(int i=1; i<nums.length; i++){
            pre[i] = pre[i-1] * nums[i-1];
        }

        for(int i=nums.length-2; i>=0; i--){
            suff[i] = suff[i+1] * nums[i+1];
        }
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = pre[i] * suff[i];
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        } */


        // Approach 3
        int nums[] = {1,2,3,4};
        int ans[] = new int[nums.length];
        Arrays.fill(ans,1);
        int curr = 1;
        for(int i=0; i<nums.length; i++){
            ans[i] = ans[i]*curr;
            curr = curr * nums[i];
        }
        curr = 1;
        for(int i=nums.length-1; i>=0; i--){
            ans[i] = ans[i] * curr;
            curr = curr * nums[i];
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
