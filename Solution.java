class Solution {

    public int dfs(int[][] matrix, int i, int j, int[][] dp) {

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int[][] dir = {
                { 0, -1 }, { 0, 1 }, { 1, 0 }, { -1, 0 }
        };

        int max = 1;

        for (int[] d : dir) {
            int newi = i + d[0];
            int newj = j + d[1];

            if (newi < 0 || newj < 0 ||
                    newi >= matrix.length ||
                    newj >= matrix[0].length) {
                continue;
            }

            if (matrix[newi][newj] > matrix[i][j]) {

                int length = 1 + dfs(matrix, newi, newj, dp);

                max = Math.max(max, length);
            }
        }

        return dp[i][j] = max;
    }

    public int longestIncreasingPath(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, dfs(matrix, i, j, dp));
            }
        }

        return ans;
    }
}
