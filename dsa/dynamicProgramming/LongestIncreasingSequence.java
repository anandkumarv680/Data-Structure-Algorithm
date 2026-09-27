package dsa.dynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;

public class LongestIncreasingSequence {
    public static  int lis(int[] sequence){

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < sequence.length; i++){
            set.add(sequence[i]);
        }

        int[] arr = new int[set.size()];
        int i = 0;
        for(int num : set){
            arr[i++] = num;

        }
        Arrays.sort(arr);

        return lcs(sequence,arr);
    }
    public static int lcs(int [] sequence, int [] arr){
        int n = sequence.length;
        int m = arr.length;

        int[][] dp = new int[n + 1][m + 1];

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(sequence[i - 1] == arr[j - 1]){
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else{
                    dp[i][j] =  Math.max(dp[i][j - 1],dp[i - 1][j]);
                }
            }
        }
        return dp[n][m];
    }
    static void main(String[] args) {
        int[] sequence = {50,3,10,7,40,80};

        System.out.println(lis(sequence));;
    }
}
