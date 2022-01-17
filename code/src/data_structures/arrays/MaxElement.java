package data_structures.arrays;


import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1, 15, 8, 24, 17, 39, 12, 75};

        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 3, 5));
    }

    static int max(int[] arr) {
        if(arr.length == 0 ) {
            return -1;
        }

        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    static int maxRange(int[] arr, int start, int end) {
        if(start > end) {
            return -1;
        }
        if(arr == null) {
            return -1;
        }

        int maxVal = arr[start];

        for (int i = start; i <= end; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}