package project.week1;

import java.util.Scanner;

public class Square {

    public static void square(int row){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < row; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. of rows: ");
        int row = sc.nextInt();

        square(row);

        sc.close();
    }
}