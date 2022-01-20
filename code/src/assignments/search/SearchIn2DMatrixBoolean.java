package assignments.search;

public class SearchIn2DMatrixBoolean {
    public static void main(String[] args) {
        int[][] sortedMatrix = {
            {1, 2, 3, 4},
            {4, 5, 6, 7},
            {8, 9, 10, 11},
            {12, 13, 14, 15}
        };

        int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,35,60}
        };

        System.out.println("3 in sortedMatrix: " + search(sortedMatrix, 3));
        System.out.println("4 in sortedMatrix: " + search(sortedMatrix, 4));
        System.out.println("9 in sortedMatrix: " + search(sortedMatrix, 9));
        System.out.println("25 in sortedMatrix: " + search(sortedMatrix, 25));
        System.out.println();
        System.out.println("3 in matrix: " + search(matrix, 3));
        System.out.println("5 in matrix: " + search(matrix, 5));
        System.out.println("15 in matrix: " + search(matrix, 15));
        System.out.println("60 in matrix: " + search(matrix, 60));
    }

    static boolean search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // Check if matrix is empty

        if (cols == 0){
            return false;
        }

        if(rows == 1) {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;

        int colMid = cols/2;

        while(rowStart < (rowEnd - 1)) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if(matrix[mid][colMid] == target) {
                return true;
            }

            if(matrix[mid][colMid] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rowStart][colMid] == target) {
            return true;
        }
        if (matrix[rowStart + 1][colMid] == target) {
            return true;
        }

        // search in 1st half
        if (target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, rowStart, 0, colMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][cols - 1]) {
            return binarySearch(matrix, rowStart, colMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rowStart + 1][colMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, colMid-1, target);
        } else {
            return binarySearch(matrix, rowStart + 1, colMid + 1, cols - 1, target);
        }
    }

    //Given row and cols, returns boolean
    static boolean binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while(colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if(matrix[row][mid] == target) {
                return true;
            }

            if(matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return false;
    }
}