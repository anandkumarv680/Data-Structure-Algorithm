package dsa.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class Catalan_Number {
    public static int catNum(int n, int[] dp){  // recursion with memoization
        if(n == 0 || n == 1){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += catNum(i,dp) * catNum(n - i - 1, dp);
        }
        return dp[n] = ans;
    }

    public static int catalan(int n){
        // find all possible bst with given node n ye question bhi catalan number se solve hoga
        int [] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for( int i = 2; i < n + 1; i++){
            for( int j = 0; j < i; j++){
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }
    static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
//        System.out.println(catNum(n, dp));
        System.out.println(catalan(n));
    }
}
