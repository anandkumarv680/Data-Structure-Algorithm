package dsa.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // sorting
        int activities[][] = new int[start.length][3];
        for(int i = 0; i < start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // in java, comparator is an interface for sorting java objects.


        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> a = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        a.add(0);
        int lastEnd = end[0];

        for(int i = 1; i < end.length; i++){
            if(start[i] >= lastEnd){
                maxAct++;
                a.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("total activies : " + maxAct);
        for(int i = 0; i < a.size(); i++){
            System.out.print("A" + a.get(i) + " ");
        }
        System.out.println();
    }
}





