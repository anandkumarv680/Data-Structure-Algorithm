package dsa.sorting;

public class BasicSort {
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){ // if i change > to < then output will be decresing order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minPos = i;
            for( int j = i + 1; j < arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            while( prev >= 0 && arr[prev] > curr){
                arr[prev + 1] =  arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void show(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr = { 3,5,1,2,4};
        insertionSort(arr);
        show(arr);
    }
}
