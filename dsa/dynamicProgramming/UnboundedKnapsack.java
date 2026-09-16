package dsa.dynamicProgramming;

public class UnboundedKnapsack {

    public static int unboundedKnapsack(int[] val, int[] wt, int w){
        if(w == 0 || wt.length == 0){
            return 0;
        }
        int[][]dp = new int[val.length + 1][w + 1];
        for(int i = 0; i < val.length + 1; i++){
            for(int j = 0; j < w + 1; j++){
                if(i ==0 || j == 0){
                    dp[i][j] = 0;
                }else if(wt[i - 1] <= j){
                    int ans1 = val[i -1] + dp[i][j - wt[i - 1]];  // i-1 ki jagah bss i ho jayega kyun same item multiple time le skte hai
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
        System.out.println(unboundedKnapsack(val,wt,w));
    }
}
