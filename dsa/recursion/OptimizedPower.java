package dsa.recursion;

import java.util.Scanner;

public class OptimizedPower {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int result = power(x , n /2);
        if(n % 2 != 0){
            return x * result * result;
        }
        else{
            return result * result;
        }

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
