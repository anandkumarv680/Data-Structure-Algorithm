package dsa.arrays2D;

public class SpiralMatrix {

    public static void Matrix(int[][]mat){
        int firstRow = 0;
        int lastRow = mat.length - 1;
        int firstCol = 0;
        int lastCol = mat[0].length - 1;

        while(firstRow <= lastRow && firstCol <= lastCol){
            // top
            for(int j = firstCol; j <= lastCol; j++){
                System.out.print(mat[firstRow][j] + " ");
            }
            // right
            for(int i = firstRow + 1; i <= lastRow; i++){
                System.out.print(mat[i][lastCol]+ " ");
            }
            //bottom
            for(int j = lastCol - 1; j >=firstCol; j--){
                if(firstRow == lastRow){
                    break;
                }
                System.out.print(mat[lastRow][j] + " ");
            }

            //left
            for(int i = lastRow - 1; i >=firstRow + 1; i--){
                if(firstCol == lastCol){
                    break;
                }
                System.out.print(mat[i][firstCol]+ " ");
            }
            firstRow++;
            firstCol++;
            lastRow--;
            lastCol--;
        }
    }
    static void main(String[] args) {
        int[][] mat = {
                {2,3,4,6,4},
                {2,3,4,1,0},
                {2,6,4,1,8},
                {7,7,5,6,8},
//                {1,7,3,0,9}
        };
        Matrix(mat);
    }

}
