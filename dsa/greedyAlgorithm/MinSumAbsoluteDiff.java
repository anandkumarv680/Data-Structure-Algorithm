package dsa.greedyAlgorithm;

import java.util.Arrays;

public class MinSumAbsoluteDiff {
    public static int minSumAbsoluteDiff(int[] A, int[] B){
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum += Math.abs(A[i] - B[i]);
        }
        return sum;

    }
    static void main(String[] args) {
        int[] A = { 4, 7, 2};
        int[] B = { 9, 1, 6};
        int result = minSumAbsoluteDiff(A,B);
        System.out.println(result);

    }
}
