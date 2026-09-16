package dsa.backTracking;

public class NQueens {
    public static boolean isSafe(char board[][], int row, int col){
        // row
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // left diagonal
        for(int i = row - 1,j = col - 1; i >= 0 && j >=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // right diagonal
        for(int i = row - 1,j = col + 1; i >= 0 && j < board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char board[][], int row){
        if(row == board.length){
//            print(board);
            count++;
            return;
        }
        for(int j = 0; j < board[row].length; j++){
          if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board, row + 1);
                board[row][j] = '.';
            }
        }
    }
    public static void print(char board[][]){
        System.out.println("------ chess board ------");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count;

    static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j] = '.';
            }
        }
        nQueen(board,0);
        System.out.println(count);

    }
}
