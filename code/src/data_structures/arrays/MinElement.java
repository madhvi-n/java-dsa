package data_structures.arrays;

import java.util.Arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {1, 15, 8, 24, 17, 39, 12, 75};

        System.out.println(Arrays.toString(arr));
        System.out.println(min(arr));
        System.out.println(minRange(arr, 2, 5));
    }

    static int min(int[] arr) {
        if(arr.length == 0 ) {
            return -1;
        }

        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    static int minRange(int[] arr, int start, int end) {
        if(start > end) {
            return -1;
        }
        if(arr == null) {
            return -1;
        }

        int minVal = arr[start];

        for (int i = start; i <= end; i++) {
            if(arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
}