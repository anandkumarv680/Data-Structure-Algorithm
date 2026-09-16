package dsa.recursion;

import java.util.Scanner;

public class LastOccurence {
    public static boolean lastOccurence(int[] arr, int key, int i){
        if(arr[i] == key){
            System.out.println("Element at index : " + i);
            return true;
        }
        if(i == 0){
            return false;
        }
        lastOccurence(arr,key ,i - 1);

        return false;
    }
    static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter element of array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key");
        int key = sc.nextInt();

        lastOccurence(arr, key,n - 1);
    }
}
