package dsa.dynamicProgramming;

public class ZeroOneKnapsack {
    public static int knapsack(int[] val, int[] wt, int w, int idx,int[][] dp){
        if(w == 0 || idx == 0){
            return 0;
        }
        // weight km hai to add kr skte hai
        if(dp[idx][w] != -1){
            return dp[idx][w];
        }
        if(wt[idx - 1] <= w){
            // include krna hai to
            int ans1 = val[idx -1] + knapsack(val, wt, w - wt[idx - 1], idx - 1,dp);

            // exclude krna hoga to
            int ans2 = knapsack(val, wt, w, idx - 1,dp);

            // dono ka maximum hi jo hoga wahi answer hoga
            dp[idx][w] = Math.max(ans2, ans1);
            return dp[idx][w];

        }
        // weight fill krne ki jagah hi nhi hai to add hi nhi kr skte
        else{
            dp[idx][w] = knapsack(val, wt, w, idx - 1,dp);
            return dp[idx][w];
        }
    }

    public static int tabKnapsack(int[] val, int[] wt, int w){
        if(w == 0 || wt.length == 0){
            return 0;
        }
        int[][]dp = new int[val.length + 1][w + 1];
        for(int i = 0; i < val.length + 1; i++){
            for(int j = 0; j < w + 1; j++){
                if(i ==0 || j == 0){
                    dp[i][j] = 0;
                }else if(wt[i - 1] <= j){
                    int ans1 = val[i -1] + dp[i - 1][j - wt[i - 1]];
                    int ans2 = dp[i - 1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }
                else{
                    dp[i][j] = dp[i -1][j];
                }
            }
        }
        return dp[val.length][w];
    }
    static void main(String[] args) {
        int[] val = {15, 14, 10, 30, 45};
        int[] wt = {2, 5, 1, 4, 3};
        int w = 7;
        int[][] dp = new int[val.length + 1][w + 1];
        for(int i = 0; i <= val.length; i++){
            for(int j = 0; j <= w; j++){
                dp[i][j] = -1;
            }
        }
//        System.out.println(knapsack(val,wt,w, val.length,dp));
        System.out.println(tabKnapsack(val,wt,w));
    }
}
