package project.week1;

import java.util.Scanner;

public class HalfDiamondInvertedNum {

    public static void numInvertedDiamond(int row) {
        int k = 1;

        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j < 2 * row - 1; j++) {
                if (j < row - 1 - i || j > row - 1 + i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + k + " ");
                }
            }
            k++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Print the No. of rows: ");
        int row = sc.nextInt();

        numInvertedDiamond(row);

        sc.close();
    }
}