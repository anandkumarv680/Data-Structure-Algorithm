package dsa.recursion;

import java.util.Scanner;

public class SortedArray {
    public static boolean isSorted( int [] arr, int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i + 1]){
            return false;
        }
        return isSorted(arr, i + 1);
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter size of array");
        int n = sc.nextInt();


        int[] arr = new int[n];
        System.out.println("Enter array element");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr, 0));
    }
}
