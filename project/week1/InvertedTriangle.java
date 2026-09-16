package project.week1;

import java.util.Scanner;

public class InvertedTriangle {

    public static void invertedTriangle(int row) {
        for (int i = row - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print the No. of rows");
        int row = sc.nextInt();

        invertedTriangle(row);

        sc.close();
    }
}