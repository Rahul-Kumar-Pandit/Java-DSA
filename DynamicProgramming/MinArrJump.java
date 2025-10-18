package DynamicProgramming;

import java.util.Arrays;

public class MinArrJump {
    public static int minJump(int[]arr,int[]dp){
        int n = arr.length;
        for(int i=n-2; i>=0; i--){
            int steps = arr[i];
            int ans = Integer.MAX_VALUE;
            for(int j=i+1; (j<=i+steps && j<n); j++){
                if(dp[j] != -1){
                    ans = Math.min(ans,dp[j]+1);
                }
            }
            if(ans != Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }
        
        return dp[0];
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        int[]dp = new int[arr.length];
        Arrays.fill(dp, -1);
        dp[arr.length-1] = 0;
        System.out.println(minJump(arr, dp));
    }
}
