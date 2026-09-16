package dsa.dynamicProgramming;

public class RodCutting {
    public static int rodCutting(int[] prices, int[] lenght, int totRod){
        int n = lenght.length;
        int[][] dp = new int[n + 1][ totRod + 1];

        // i for prices and j for length
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < totRod + 1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                    continue;
                }
                int l = lenght[i - 1];
                if(l <= j){
                    dp[i][j] = Math.max(prices[i - 1] + dp[i][j - l], dp[i - 1][j]);
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][totRod];
    }
    static void main(String[] args) {
        int[] prices = {1,5,8,9,10, 17, 17,20};
        int[] length = {1,2,3,4,5,6,7,8};
        int totRod = 8;

        System.out.println(rodCutting(prices, length, totRod));
    }
}
