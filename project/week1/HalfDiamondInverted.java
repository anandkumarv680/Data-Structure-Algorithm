package project.week1;

import java.util.Scanner;

public class HalfDiamondInverted {

    public static void invertedDiamond(int row) {
        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j < 2 * row - 1; j++) {
                if (j < row - 1 - i || j > row - 1 + i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print the No. of rows");
        int row = sc.nextInt();

        invertedDiamond(row);

        sc.close();
    }
}