package dsa.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int coinUsed = 0;
        int amount = 1999;

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i< coins.length; i++){
            if(coins[i] <= amount){
                while (coins[i] <= amount){
                    coinUsed++;
                    arr.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("tatal coin used : " + coinUsed);

        for(Integer ans : arr){
            System.out.print(ans + " ");
        }
        System.out.println();
    }
}
