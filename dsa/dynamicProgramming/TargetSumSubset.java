package dsa.dynamicProgramming;

public class TargetSumSubset {
    public static boolean sum(int[] arr, int sum){
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // i is apna total item and j is apna total sum or target sum
        for(int i = 0; i < n + 1; i++){
            dp[i][0] = true;
        }
        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < sum + 1; j++){
                int v = arr[i - 1];
                if(v <= j && dp[i - 1][j - v]){
                    dp[i][j] = true;
                }
                else if(dp[i -1][j]){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];

    }
    static void main(String[] args) {
        int[] arr = {6,3,1,4,3,5};
        int sum = 6;
        System.out.println(sum(arr,sum));
    }
}
