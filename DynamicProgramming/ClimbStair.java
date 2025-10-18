package DynamicProgramming;

// import java.util.Arrays;

public class ClimbStair {
    /*                  RECURSION                        */
    public static int countWays(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return countWays(n-1)+countWays(n-2);
    }

    /*                  MEMOIZATION                        */
    public static int countWaysMemoization(int dp[],int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = countWaysMemoization(dp,n-1) + countWaysMemoization(dp, n-2);
        return dp[n];
    }

    /*                  TABULATION                        */
    public static int countWaysTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i=1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }        
        }
        return dp[n];
    } 
    public static void main(String[] args) {
        int n=5;
       
        // Recursion
        // System.out.println(countWays(n));

        // Memoization
        // int dp[] = new int[n+1];
        // for(int i=0; i<dp.length; i++){
        //     dp[i] = -1;
        // }
        // Arrays.fill(dp,-1);
        // System.out.println(countWaysMemoization( dp,n));


        // Tabulation 
        System.out.println(countWaysTabulation(n));
    }
}




// class Solution {
//     public String countOfAtoms(String formula) {
//         Stack<HashMap<String,Integer>> stk = new Stack<>();
//         stk.push(new HashMap<String,Integer>());
//         int idx = 0;
//         while(idx < formula.length()){
//             char ch = formula.charAt(idx);
//             if(ch == '('){
//                 stk.push(new HashMap<String,Integer>());
//                 idx++;
//             }else if(ch == ')'){
//                 HashMap<String,Integer> currMap = stk.pop();
//                 idx++;
//                 StroingBuilder digit = new StringBuilder();
//                 while(idx<formula.length() && Character.isDigit(formula.charAt(idx))){
//                     digit.append(formula.charAt(idx));
//                     idx++;
//                 }

//                 if(digit.length()>0){
//                     int m = Integer.parseInt(digit.toString());
//                     for(String atom : currMap.keySet()){
//                         currMap.put(atom,currMap.get(atom)*m);
//                     }
//                 }

//                 for(String atom : currMap.keySet()){
//                     stk.peek().put(
//                         atom,
//                         stk.peek().getOrDefault(atom,0)+currMap.get(atom);
//                     );
//                 }
//             }else{
//                 StringBuilder atomName = new StringBuilder();
//                 atomName.append(ch);
//                 idx++;
//                 while(idx<formula.length() && Character.isLowerCase(formula.charAt(idx))){
//                     atomName.append(formula.charAt(idx));
//                     idx++;
//                 }

//                 StroingBuilder count = new StringBuilder();
//                 while(idx<formula.length() && Character.isDigit(formula.charAt(idx))){
//                     count.append(formula.charAt(idx));
//                     idx++;
//                 }

//                 int c = (count.length()>0)?Integer.parseInt(count.toString()) : 1;

//                 stk.peek().put(
//                         atomName,
//                         stk.peek().getOrDefault(atomName,0)+c;
//                     );        
//             }
//         }

//         TreeMap<String,Integer> treeMap = new TreeMap<>(stk.peek());
//         StringBuilder result = new StringBuilder();
//         for(String atom : treeMap.keySet()){
            
//         }

//     }
// }