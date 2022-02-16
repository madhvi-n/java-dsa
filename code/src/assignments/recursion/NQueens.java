package assignments.recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board  = new boolean[n][n];
        System.out.println(nQueens(board, 0));

        System.out.println();

        System.out.println(queens(board, 0));
    }

    static int nQueens(boolean[][] board, int row) {
        if(row == board.length) {
            display(board);
            return 1;
        }

        int count = 0;

        //Placing the queen and checking every row and column
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count = count + nQueens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static List<List<List<String>>> queens(boolean[][] board, int row) {
        List<List<List<String>>> res = new ArrayList<>();

        if(row == board.length) {
            List<List<List<String>>> ans = getUpdatedBoard(board);
            res.addAll(ans);
            return res;
        }

        //Placing the queen and checking every row and column
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                res.addAll(queens(board, row + 1));
                board[row][col] = false;
            }
        }
        return res;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        //Check vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }

        //Diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        //Diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        for(boolean[] row: board) {
            for(boolean cell: row) {
                if(cell) {
                    System.out.print("Q ");
                } else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static List<List<List<String>>> getUpdatedBoard(boolean[][] board) {
        List<List<List<String>>> matrix = new ArrayList<>();
        List<List<String>> grid = new ArrayList<>();

        for(boolean[] row: board) {
            List<String> rowList = new ArrayList<>();
            for(boolean cell: row) {
                if(cell) {
                    rowList.add("Q");
                } else{
                    rowList.add("X");
                }
            }
            grid.add(rowList);
        }

        matrix.add(grid);
        return matrix;
    }
}