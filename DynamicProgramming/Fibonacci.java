package DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    // This Function takes exponential time O(2^n)
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    // For this code I am going to use an array to store f[n] value that means it doest 
    // not call the same value again and Time complecity decrease from exponential to linear O(n)

    public static int fib(int n,int f[]){
        if(n == 0 || n == 1){
            return n;
        }

        if(f[n] != 0){
            return f[n];
        }
        f[n] = fib(n-1,f) + fib(n-2,f);
        return f[n];
    }

    // Tabulation 
    public static int fibTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int ans = 0;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        ans = dp[n];
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        // int f[] = new int[n+1];
        // System.out.println(fib(n,f));
        System.out.println(fibTabulation(n));
        sc.close();
    }
}
