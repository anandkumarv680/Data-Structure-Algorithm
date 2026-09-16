package dsa.dynamicProgramming;

import java.util.Arrays;

public class ClimbingStairs {
    public static int ways(int n, int[] dp){ // memoization method(top down)
        if(n == 0){
            return 1;
        }
        if( n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] =  ways(n -1, dp) + ways(n - 2, dp);
        return dp[n];
    }

    public static int way(int n){ // tabulation method(bottom up)   is more efficent then top down
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = dp[i - 1] + 0;
            }
            else{
                dp[i] = dp[i - 1] + dp[i - 2];
            }

        }
        return dp[n];
    }

    static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp,-1);
        System.out.println(ways(n, dp));
        System.out.println(way(8));
    }
}
