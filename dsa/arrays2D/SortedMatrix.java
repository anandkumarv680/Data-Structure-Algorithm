package dsa.arrays2D;

public class SortedMatrix {

    public static boolean Search(int[][]mat, int key){
        int row = 0;
        int col = mat[0].length - 1;

        while(row < mat.length && col >= 0){
            if(key == mat[row][col]){
                System.out.println("element found at (" + row +","+ col +")");
                return true;
            }
            else if(key < mat[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("element  not found!");
        return false;
    }

    static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {20,27,38,49},
                {32,33,39,59},
        };
        int key = 3;
        Search(mat, key);

    }
}
