package dsa.dynamicProgramming;

public class CoinChange {
    public static int coinChange(int[] coin, int amount) {
        int n = coin.length;
        int[][] dp = new int[n + 1][amount + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }


        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                int c = coin[i - 1];
                if (c <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - c];     // i-1 ki jagah bss i ho jayega kyun same item multiple time le skte hai
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < amount + 1; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return dp[n][amount];
    }

    static void main(String[] args) {
        int[] coin = {1, 2, 5, 10, 20, 50};
        int amount = 5;
        System.out.println(coinChange(coin, amount));
    }
}
