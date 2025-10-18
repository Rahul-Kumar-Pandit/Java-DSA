package DynamicProgramming;

public class ZeroOneKnapsackTabulation {
    public static int tabulation(int val[],int wt[],int dp[][],int W,int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=W; j++){
                int v = val[i-1];
                int w = wt[i-1];

                if(w <= j){     //valid
                    int includeProfit = v + dp[i-1][j-w];
                    int excludeProfit = dp[i-1][j];

                    dp[i][j] = Math.max(includeProfit, excludeProfit);
                }else{  // invalid
                    int excludeProfit = dp[i-1][j];
                    dp[i][j] = excludeProfit;
                }
            }
        }
        printAllValue(dp);
        return dp[n][W];
    }

    public static void printAllValue(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int n = val.length;
        int W = 7;
        int dp[][] = new int[n+1][W+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else{
                    break;
                }
            }
        }
        System.out.println(tabulation(val, wt, dp, W, n));
    }
}