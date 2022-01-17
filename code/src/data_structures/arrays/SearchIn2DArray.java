package data_structures.arrays;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {11, 32, 43, 47},
            {45, 15, 24, 16},
            {10, 15, 46, 13},
            {41, 14, 9, 3}
        };

        int target = 46;

        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int[] row : arr) {
            for (int val : row) {
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }

    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;

        for (int[] row : arr) {
            for (int val : row) {
                if (val < min) {
                    min = val;
                }
            }
        }
        return min;
    }
}