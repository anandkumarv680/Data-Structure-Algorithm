package dsa.recursion;

import java.util.Scanner;

public class Power {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x , n - 1);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x = sc.nextInt();
        System.out.println("Enter power of x");
        int n = sc.nextInt();
        System.out.println(power(x,n));;
    }
}
