package dsa.recursion;

import java.util.Scanner;

public class PrintNum {
    public static void decNum(int n){
        if(n == 0){
            System.out.println("Completed");
            return ;
        }
        System.out.println(n);
        decNum(n - 1);

    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        decNum(n);
    }
}
