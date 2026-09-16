package project.week1;

import java.util.Scanner;

public class NumSquare {

    public static void numSquare(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(" 1 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Print the No. of rows: ");
        int row = sc.nextInt();

        numSquare(row);

        sc.close();
    }
}