package project.week1;

import java.util.Scanner;

public class NumTriangle {

    public static void numTriangle(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + (j + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Print the No. of rows: ");
        int row = sc.nextInt();

        numTriangle(row);

        sc.close();
    }
}