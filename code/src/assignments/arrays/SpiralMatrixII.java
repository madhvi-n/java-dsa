package assignments.arrays;

//  https://leetcode.com/problems/spiral-matrix-ii/

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
        System.out.println(Arrays.deepToString(generateMatrix(4)));
    }

    static int[][] generateMatrix(int n) {
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        int counter = 1;

        int[][] result = new int[n][n];

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int index = colStart; index <= colEnd; index++) {
                result[rowStart][index] = counter ++;
            }
            rowStart ++;


            for (int index = rowStart; index <= rowEnd; index++) {
                result[index][colEnd] = counter ++;
            }
            colEnd --;


            if(rowStart <= rowEnd) {
                for (int index = colEnd; index >= colStart ; index--) {
                    result[rowEnd][index] = counter ++;
                }
            }
            rowEnd --;

            if(colStart <= colEnd) {
                for (int index = rowEnd; index >= rowStart; index--) {
                    result[index][colStart] = counter ++;
                }
            }
            colStart ++;
        }
        return result;
    }
}