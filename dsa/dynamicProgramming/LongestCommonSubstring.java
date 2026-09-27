package dsa.dynamicProgramming;

public class LongestCommonSubstring {

    public static int lcs(String s1, String s2){
        int [][] dp = new int[s1.length()][s2.length()];

        int ans = 0;
        for(int i = 1; i < dp.length; i++){
            for ( int j = 1; j < dp[0].length; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j] );
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;

    }
    static void main(String[] args) {
        String str1 = "anandkumarverma";
        String str2 = "ndkuverama";
        System.out.println(lcs(str1, str2));
    }
}
