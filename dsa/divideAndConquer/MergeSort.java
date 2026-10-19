package dsa.divideAndConquer;

public class MergeSort {

    public static void mergeSort(int[] arr, int st, int en) {
        if (st >= en) {
            return;
        }

        int mid = st + (en - st) / 2;

        mergeSort(arr, st, mid);
        mergeSort(arr, mid + 1, en);

        merge(arr, mid, st, en);
    }

    public static void merge(int[] arr, int mid, int st, int en) {

        int[] temp = new int[en - st + 1];

        int i = st;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= en) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= en) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = st; k < temp.length; k++) {
            arr[i++] = temp[k];
        }
    }

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 2, 9, 0, 6, 4};

        mergeSort(arr, 0, arr.length - 1);
        print(arr);
    }
}
