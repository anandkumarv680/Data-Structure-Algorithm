package dsa.arrays2D;

import java.util.Scanner;

public class Creation {

    public static boolean Search(int[][] mat, int key){
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == key){
                    System.out.print("at index[" + i + "," + j +"]");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];

        int m = mat.length;
        int n = mat[0].length;

        System.out.println("Enter element");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + " ");;
            }
            System.out.println();
        }

        Search(mat, 6);

    }
}
