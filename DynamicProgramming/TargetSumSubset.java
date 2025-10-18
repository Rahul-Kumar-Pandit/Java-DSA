package DynamicProgramming;

public class TargetSumSubset {
    public static boolean targerSum(int arr[],int Tsum,boolean dp[][],int n){
        for(int i=1; i<n+1; i++){
            for(int j=1; j<Tsum+1; j++){
                int v = arr[i-1];
                
                // include
                if(v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }

                // exclude
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }

            }
        }
        printDpArray(dp);
        return dp[n][Tsum];
    }

    public static void printDpArray(boolean dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[] = {4,2,7,1,3};
        int Tsum = 10;
        int n = numbers.length;
        boolean dp[][] = new boolean[n+1][Tsum+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(j == 0){
                    dp[i][j] = true; 
                }else{
                    break;
                }
            }
        }
        System.out.println(targerSum(numbers, Tsum, dp, n));
    }
}
