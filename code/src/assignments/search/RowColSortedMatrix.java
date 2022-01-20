package assignments.search;

import java.util.Arrays;

public class RowColSortedMatrix {
    public static void main(String[] args) {
        int[][] sortedMatrix = {
            {10, 20, 30, 40},
            {11, 25, 35, 45},
            {25, 29, 37, 49},
            {33, 34, 38, 40}
        };

        System.out.println(Arrays.toString(search(sortedMatrix, 37)));
        System.out.println(Arrays.toString(search(sortedMatrix, 45)));
        System.out.println(Arrays.toString(search(sortedMatrix, 29)));
        System.out.println(Arrays.toString(search(sortedMatrix, 54)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return new int[]{row, col};
            }

            if(matrix[row][col] > target) {
                col --;
            } else{
                row ++;
            }
        }
        return new int[]{-1,-1};
    }
}