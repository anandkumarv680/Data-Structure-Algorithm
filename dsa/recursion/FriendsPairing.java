package dsa.recursion;

import java.util.Scanner;

public class FriendsPairing {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) *friendsPairing( n - 2);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no. of Friends");
        int n = sc.nextInt();
        System.out.println(friendsPairing(n));
    }
}
