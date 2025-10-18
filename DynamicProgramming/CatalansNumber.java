package DynamicProgramming;

import java.util.Arrays;

public class CatalansNumber {

    /*              USING RECURSION                          */
    public static int catalanRecursion(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            ans += catalanRecursion(i) * catalanRecursion(n-i-1);
        }
        return ans;
    }


    /*              USING MEMOIZATION                    */
    public static int catalanMemoization(int num,int dp[]){
        if(num == 0 || num == 1){
            return 1;
        }
        if(dp[num] != -1){
            return dp[num];
        }
        int ans = 0;
        for(int i=0; i<num; i++){
            ans += catalanMemoization(i, dp) * catalanMemoization(num-i-1, dp);
        }
        dp[num] = ans;
        return dp[num];
    }


    /*              USING  TABULATION                 */
    public static int catalanTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = dp[1] = 1;
        for(int i=2; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        // System.out.println(catalanMemoization(n, dp));
        System.out.println(catalanTabulation(n));
    }    
}