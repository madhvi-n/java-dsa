package data_structures.arrays;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        int[] arr = {1, 15, 8, 24, 3, 17, 39, 12};
        System.out.println(Arrays.toString(arr));

        System.out.println("Swapping...");
        swap(arr, 1, 5);
        System.out.println(Arrays.toString(arr));

        System.out.println("Reversing...");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}