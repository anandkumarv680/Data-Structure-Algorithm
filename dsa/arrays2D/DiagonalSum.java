package dsa.arrays2D;

public class DiagonalSum {
    public static void dSum(int [][]mat){
        int sum = 0;
        int l = mat.length;
        for(int i = 0; i < l; i++){
            sum += mat[i][i];
            if(i != l - 1 - i)
                sum += mat[i][l - 1 - i];
        }
        System.out.println("the sum is : " + sum);
    }
    static void main(String[] args) {
        int[][] mat = {
                {2,3,4,6,4},
                {2,3,4,1,0},
                {2,6,4,1,8},
                {7,7,5,6,8},
                {1,7,3,0,9}
        };
        dSum(mat);
    }
}
