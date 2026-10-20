package dsa.dynamicProgramming;

import java.util.Arrays;

public class MatrixChainMultiplication {

    public static int mcm(int [] arr, int i, int j){
        if(i == j){
            return 0;
        }

        int minCost = Integer.MAX_VALUE;

        for( int k = i; k < j; k++){
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];

            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }

        return minCost;
    }

    public static int mcmMemoization(int[] arr,int i, int j, int[][] dp ){
        if(i == j){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int minCost = Integer.MAX_VALUE;

        for(int k = i; k < j; k++){
            int cost1 = mcmMemoization(arr, i, k, dp);
            int cost2 = mcmMemoization(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];

            int finalCost = cost1 + cost2 + cost3;

            minCost = Math.min(finalCost, minCost);
        }

        return dp[i][j] = minCost;


    }
    static void main(String[] args) {
        int[] arr = {1,2,3,4,3};

        int n = arr.length;

        // System.out.println(mcm(arr,1,n - 1));

        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        System.out.println(mcmMemoization(arr, 1, n - 1, dp));

    }
}
