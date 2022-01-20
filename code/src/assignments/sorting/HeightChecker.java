package assignments.sorting;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        int[] arr2 = {5,1,2,3,4};
        int[] arr3 = {1,2,3,4,5};

        System.out.println(checker(arr));
        System.out.println(checker(arr2));
        System.out.println(checker(arr3));
    }

    static int checker(int[] heights) {
        int count = 0;
        int[] expected = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }

        sort(expected);

        // If any index, heights and expected does not match, increase count by 1
        for (int index = 0; index < heights.length; index++) {
            if(heights[index] != expected[index]) {
                count++;
            }
        }
        return count;
    }

    static void sort(int[] arr) {
        //Sort the expected heights array using any sorting method
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}