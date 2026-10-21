package dsa.divideAndConquer;

public class QuickSort {

    public static void quickSort(int [] arr, int si, int en){
        if(si >= en){
            return ;
        }

        int pivot = partition(arr, si, en);

        quickSort(arr, si, pivot - 1);
        quickSort(arr, pivot + 1, en);
    }

    public static int partition(int[] arr, int si, int en) {

        int pivot = arr[en];

        int i = si - 1;

        for (int j = si; j < en; j++) {
            if (pivot <= arr[j]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[en];
        arr[en] = temp;

        return i;

    }

    public static void main(String[] args) {

        int[] arr = {2,4,1,2,8,0,-4,-2,-9};

        quickSort(arr, 0, arr.length - 1);

        for(int n : arr){
            System.out.println(n);
        }
    }
}
