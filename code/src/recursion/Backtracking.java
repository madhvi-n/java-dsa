package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(allPaths("", board, 0, 0));
        int[][] path = new int[board.length][board[0].length];
        allPathsPrint("", board, 0, 0, path, 1);
    }

    // Backtracking
    static ArrayList<String> allPaths(String p, boolean[][] maze, int row, int col) {
        ArrayList<String> res = new ArrayList<>();

        if(row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(!maze[row][col]) {
            return res;
        }

        maze[row][col] = false;

        if(row < maze.length - 1) {
            ArrayList<String> diagonal = allPaths(p + 'D', maze, row + 1, col);
            res.addAll(diagonal);
        }


        if(col < maze[0].length - 1) {
            ArrayList<String> horizontal = allPaths(p + 'R', maze, row, col + 1);
            res.addAll(horizontal);
        }

        if(row > 0) {
            ArrayList<String> up = allPaths(p + 'U', maze, row - 1, col);
            res.addAll(up);
        }

        if(col > 0) {
            ArrayList<String> up = allPaths(p + 'L', maze, row, col - 1);
            res.addAll(up);
        }

        //Revert the changes while going back
        maze[row][col] = true;

        return res;
    }

    static void allPathsPrint(String p, boolean[][] maze, int row, int col, int[][] path, int step) {

        if(row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for(int[]arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length - 1) {
            allPathsPrint(p + 'D', maze, row + 1, col, path, step + 1);
        }


        if(col < maze[0].length - 1) {
            allPathsPrint(p + 'R', maze, row, col + 1, path, step + 1);
        }

        if(row > 0) {
            allPathsPrint(p + 'U', maze, row - 1, col, path, step + 1);
        }

        if(col > 0) {
            allPathsPrint(p + 'L', maze, row, col - 1, path, step + 1);
        }

        //Revert the changes while going back
        maze[row][col] = true;
        path[row][col] = 0;
    }
}