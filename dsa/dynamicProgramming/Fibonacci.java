package dsa.dynamicProgramming;

public class Fibonacci {
    // both work in linear time complexity
    public static int fibonacci(int n, int[] dp){ // memoization method(top down)
        if(n == 0|| n == 1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] =  fibonacci(n -1, dp) + fibonacci(n - 2, dp);
        return dp[n];
    }

    public static int fib(int n){ // tabulation method(bottom up)   is more efficent then top down
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i -2] + dp[i - 1];
        }
        return dp[n];
    }

    static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println(fibonacci(n, dp));
        System.out.println(fib(8));
    }
}
