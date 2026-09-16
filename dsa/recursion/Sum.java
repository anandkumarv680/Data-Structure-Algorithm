package dsa.recursion;

import java.util.Scanner;

public class Sum {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n - 1);

    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(sum(n));;
    }
}
