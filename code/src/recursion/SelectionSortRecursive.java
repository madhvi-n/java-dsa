package recursion;

import java.util.Arrays;

public class SelectionSortRecursive {
    public static void main(String[] args) {
        int[] arr = {0, 4, 5, 2, 6, 8, 3, 1};
        selectionSort(arr, arr.length - 1, 0, 5);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int r, int c, int max) {
        if(r == 0) {
            return;
        }

        if( c < r) {
            if(arr[c] > arr[max]) {
                selectionSort(arr, r, c + 1, c);
            } else {
                selectionSort(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[r - 1] = arr[max];
            arr[max] = temp;

            selectionSort(arr, r - 1, 0, 0);
        }
    }
}