package assignments.recursion;

import java.util.Arrays;

public class ValidSudoku {
    public static void main(String[] args) {
        int[][] board = new int[][] {
            {8, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0 ,6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        int[][] board2 = new int[][] {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
//        System.out.println(validSudoku(board));
        System.out.println(validSudoku(board2));
    }

    static boolean validSudoku(int[][] board) {
        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] != 0) {
                    System.out.println(Arrays.toString(new int[]{i, j}));
                    boolean ans = validate(board, i, j, board[i][j]);
                    if(!ans) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static boolean validate(int[][] board, int row, int col, int num) {
        //Check the row
        for (int i = 0; i < board.length; i++) {
            //Check if the number exists in the row
            if(board[row][i] == num) {
                System.out.println(Arrays.toString(new int[]{row, i}));
                return false;
            }
        }

        //Check the column
        for (int[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if(board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}