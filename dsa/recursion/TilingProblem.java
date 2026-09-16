package dsa.recursion;

import java.util.Scanner;

public class TilingProblem {
    public static int totalWays(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return totalWays(n - 1) + totalWays( n - 2);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Block");
        int n = sc.nextInt();
        System.out.println(totalWays(n));
    }
}
