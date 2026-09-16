package project.week1;

import java.util.Scanner;

public class HollowSquare {

    public static void hollowSquare(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i > 0 && i < row - 1 && j > 0 && j < row - 1) {
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

        System.out.println("Enter the No. of rows");
        int row = sc.nextInt();

        hollowSquare(row);

        sc.close();
    }
}