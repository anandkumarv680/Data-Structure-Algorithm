package project.week1;

import java.util.Scanner;

public class NumHalfDiamond {

    public static void numHalfDiamond(int row) {
        // Upper Half
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + (i + 1) + " ");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = row - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(" " + (i + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Print the No. of rows: ");
        int row = sc.nextInt();

        numHalfDiamond(row);

        sc.close();
    }
}