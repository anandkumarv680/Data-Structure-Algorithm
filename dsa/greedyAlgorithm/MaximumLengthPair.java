package dsa.greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthPair {
    static void main(String[] args) {
        int pair[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pair, Comparator.comparingDouble(o->o[1]));

        int chainLength = 1;
        int chainEnd = pair[0][1];

        for(int i = 1; i < pair.length; i++){
            if(pair[i][0] > chainEnd){
                chainLength++;
                chainEnd = pair[i][1];
            }
        }

        System.out.println("Max length : " + chainLength);
    }
}
