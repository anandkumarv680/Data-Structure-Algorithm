package project.week1;

import java.util.Scanner;

public class Triangle {

    public static void triangle(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No. of rows");
        int row = sc.nextInt();

        triangle(row);

        sc.close();
    }
}