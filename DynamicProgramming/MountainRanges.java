package DynamicProgramming;

public class MountainRanges {
    public static int mountainRange(int n){
        // Here n is the pair (/\) or stroke 
        
        int dp[] = new int[n+1];
        dp[0] = dp[1] = 1;
        for(int i=2; i<=n; i++){
            for(int j=0; j<i; j++){
                int in = dp[j];
                int out = dp[i-j-1];
                dp[i] +=  in*out ;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(mountainRange(n));
    }
}
