package dsa.sorting;
import java.util.Arrays;
import java.util.Collections;

public class InbuildSorting {

    public static void show(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int [] arr = { 3, 4, 2, 1, 2};
//        Arrays.sort(arr);
//        show(arr);

        Arrays.sort(arr, 0 , 4);
        show(arr);

//        Arrays.sort(arr, Collections.reverseOrder());   it works when change int to integer collection work on class not primitive data type
//        show(arr);
    }
}
