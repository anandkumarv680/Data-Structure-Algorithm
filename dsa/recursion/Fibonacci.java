package dsa.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return (fibo(n - 1) + fibo( n - 2));

    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(fibo(n));;
    }
}
