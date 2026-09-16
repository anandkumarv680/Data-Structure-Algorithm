package project.week1;

import java.util.Scanner;

public class SandwhichPattern {

    public static void sandwichPattern(int row) {

        // Upper Part
        for (int i = row - 2; i >= 0; i--) {
            for (int j = 0; j < 2 * row - 1; j++) {
                if (j < row - 1 - i || j > row - 1 + i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + (i + 1) + " ");
                }
            }
            System.out.println();
        }

        // Lower Part
        for (int i = 1; i < row - 1; i++) {
            for (int j = 0; j < 2 * row - 1; j++) {
                if (j < row - 1 - i || j > row - 1 + i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + (i + 1) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Print the No. of rows: ");
        int row = sc.nextInt();

        sandwichPattern(row);

        sc.close();
    }
}