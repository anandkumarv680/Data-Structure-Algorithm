package dsa.recursion;

import java.util.Scanner;

public class BinaryString {
    public static void binaryString(int n, int lastval, String sb){
        if(n == 0){
            System.out.println(sb);
            return;
        }
        binaryString(n - 1,0 ,sb+"0");
        if(lastval == 0){
              binaryString(n -1, 1, sb+"1");
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        String sb = "";
        binaryString(n,0, sb);

    }
}
