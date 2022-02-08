package assignments.arrays;

//  https://leetcode.com/problems/spiral-matrix/

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrixI {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(Arrays.toString(new ArrayList[]{spiralMatrix(arr1)}));
        System.out.println(Arrays.toString(new ArrayList[]{spiralMatrix(arr2)}));
    }

    static ArrayList<Integer> spiralMatrix(int[][] matrix) {
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        ArrayList<Integer> result = new ArrayList<>();

        while (rowStart < rowEnd && colStart <= colEnd) {
            for (int index = colStart; index <= colEnd; index++) {
                result.add(matrix[rowStart][index]);
            }
            rowStart ++;

            for (int index = rowStart; index <= rowEnd; index++) {
                result.add(matrix[index][colEnd]);
            }
            colEnd --;


            if(rowStart <= rowEnd) {
                for (int index = colEnd; index >= colStart ; index--) {
                    result.add(matrix[rowEnd][index]);
                }
            }
            rowEnd --;

            if(colStart <= colEnd) {
                for (int index = rowEnd; index >= rowStart; index--) {
                    result.add(matrix[index][colStart]);
                }
            }
            colStart ++;
        }

        return result;
    }
}