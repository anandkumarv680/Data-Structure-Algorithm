class Solution {

    public static int findTargetSumWays(int[] nums, int target) {
        int m = 0;
        int n = nums.length;
        for(int num : nums){
            m += num;
        }

        int [][] dp = new int [n + 1][2*m + 1];

        dp[0][m] = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= 2*m; j++){
                if(dp[i - 1][j] != 0){
                    dp[i][j + nums[i - 1]] += dp[i - 1][j];
                    dp[i][j - nums[i - 1]] += dp[i - 1][j];
                }
            }
        }

        return dp[n][m + target];

        // for(int i = 0; i <= n; i++){
        //     for(int j = 0; j <= 2*m; j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        

    }

    public static void main(String[] args) {
        int [] arr = {1,1,1};
        int target = 3;

        System.out.println(findTargetSumWays(arr, target));;
    }
}