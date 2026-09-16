package dsa.dynamicProgramming;

public class LongestCommonSubsequence {
    public static int lsc(String s1, String s2, int m, int n){
        if(m == 0 || n == 0){
            return 0;
        }
        if(s1.charAt(m - 1) == s2.charAt(n - 1)){
            return  lsc(s1,s2, m - 1, n - 1) + 1;
        }
        else{
            return Math.max(lsc(s1,s2, m, n - 1),lsc(s1,s2, m - 1, n));
        }
    }

    // by memoization method

    public static int lsc2(String s1, String s2, int m, int n, int[][] dp){
        if(m == 0 || n == 0){
            return 0;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        if(s1.charAt(m - 1) == s2.charAt(n - 1)){
            dp[m][n] =  lsc2(s1,s2, m - 1, n - 1,dp) + 1;
            return dp[m][n];
        }
        else{
            dp[m][n] = Math.max(lsc2(s1,s2, m, n - 1,dp),lsc2(s1,s2, m - 1, n,dp));
            return dp[m][n];
        }
    }

    // by tabulation method

    public static int lsc3(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for(int i = 1; i < m + 1; i++){
            for(int j = 1; j < n + 1; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else{
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j -1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[m][n];
    }

    static void main(String[] args) {
        String s1 = "abcdefgh";
        String s2 = "adh";
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][ n + 1];

        for(int i = 0; i < m + 1; i++){
            for(int j = 0; j < n + 1; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(lsc3(s1, s2));
    }
}
