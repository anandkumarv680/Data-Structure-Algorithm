package project.week1;

import java.util.Scanner;

public class Diamond {

    public static void diamond(int row) {

        // Upper Half
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2 * row - 1; j++) {
                if (j < row - 1 - i || j > row - 1 + i) {
                    System.out.print("   ");
                    continue;
                }
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = row - 2; i >= 0; i--) {
            for (int j = 0; j < 2 * row - 1; j++) {
                if (j < row - 1 - i || j > row - 1 + i) {
                    System.out.print("   ");
                    continue;
                }
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print the No. of rows");
        int row = sc.nextInt();

        diamond(row);

        sc.close();
    }
}
