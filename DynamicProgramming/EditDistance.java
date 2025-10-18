package DynamicProgramming;

public class EditDistance {
    public static int editDist(String word1,String word2){
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n+1][m+1];
        // Initialize
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i==0){
                    dp[i][j] = j;
                }
                if(j==0){
                    dp[i][j] = i;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    // add
                    int add = dp[i][j-1] + 1;
                    // delete 
                    int delete = dp[i-1][j] + 1;
                    // Replace
                    int replace = dp[i-1][j-1] + 1;
                    
                    dp[i][j] = Math.min(add,Math.min(delete,replace));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        int result = editDist(word1, word2);
        System.out.println(result);
    }
}
