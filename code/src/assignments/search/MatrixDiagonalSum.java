package assignments.search;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] matrix3 = {{1}};

        int[][] matrix4 = {
                {1, 1, 1, 1,},
                {1, 1, 1, 1,},
                {1, 1, 1, 1,},
                {1, 1, 1, 1,}
        };

        System.out.println(matrixSum(matrix));
        System.out.println(matrixSum(matrix2));
        System.out.println(matrixSum(matrix3));
        System.out.println(matrixSum(matrix4));
    }

    static int matrixSum(int[][] matrix) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int rowStart = 0;
        int colEnd = matrix[0].length - 1;

        //Considering a 3x3 matrix
        //Primary diagonal lie over indices 00, 11, 22 ...
        //Secondary diagonal lies over indices 20, 11, 02...

        while(rowStart < matrix.length && colEnd >= 0) {
            primaryDiagonal += matrix[rowStart][rowStart];

            if(rowStart != colEnd) {
                secondaryDiagonal += matrix[rowStart][colEnd];
            }

            rowStart ++;
            colEnd --;
        }
        //Keeping both sum separate just in case
        return primaryDiagonal + secondaryDiagonal;
    }
}