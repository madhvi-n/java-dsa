package assignments.recursion;

import java.util.ArrayList;
import java.util.List;

public class NKnights {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board  = new boolean[n][n];
        List<List<List<String>>> ans = nKnights(board, 0, 0, n);
        System.out.println(ans.size());

        for(List<List<String>> row: ans) {
            System.out.println(row);
        }
    }

    static List<List<List<String>>> nKnights(boolean[][] board, int row, int col, int knights) {
        List<List<List<String>>> res = new ArrayList<>();

        if(knights == 0) {
            List<List<List<String>>> ans = getUpdatedBoard(board);
            res.addAll(ans);
            return res;
        }

        if(row == board.length - 1 && col == board.length) {
            return res;
        }

        if(col == board.length) {
            res.addAll(nKnights(board, row + 1, 0, knights));
            return res;
        }

        if(isSafe(board, row, col)) {
            board[row][col] = true;
            res.addAll(nKnights(board, row, col + 1, knights - 1));
            board[row][col] = false;
        }

        res.addAll(nKnights(board, row, col + 1, knights));
        return res;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row - 2, col - 1)) {
            if(board[row - 2][col - 1]) {
                return false;
            }
        }

        if(isValid(board, row - 2, col + 1)) {
            if(board[row - 2][col + 1]) {
                return false;
            }
        }

        if(isValid(board, row - 1, col + 2)) {
            if(board[row - 1][col + 2]) {
                return false;
            }
        }

        if(isValid(board, row - 1, col - 2)) {
            if(board[row - 1][col - 2]) {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        if(row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    static void display(boolean[][] board) {
        for(boolean[] row: board) {
            for(boolean cell: row) {
                if(cell) {
                    System.out.print("K ");
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
                    rowList.add("K");
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