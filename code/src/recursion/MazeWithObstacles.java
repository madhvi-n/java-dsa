package recursion;

import java.util.ArrayList;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] board = {{true, true, true}, {true, true, true}, {true, true, true}};
        printPathRestrictions("", board, 0,0);
        System.out.println(getPaths("", board, 0, 0));
        System.out.println(getPathsWithDiagonal("", board, 0, 0));
    }

    static void printPathRestrictions(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[row][col]) {
            return;
        }

        if(row < maze.length - 1) {
            printPathRestrictions(p + 'V', maze, row + 1, col);
        }

        if(col < maze[0].length - 1) {
            printPathRestrictions(p + 'H', maze, row, col + 1);
        }
    }

    // For two directions - vertical and horizontal
    static ArrayList<String> getPaths(String p, boolean[][] maze, int row, int col) {
        ArrayList<String> res = new ArrayList<>();

        if(row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(!maze[row][col]) {
            return res;
        }

        if(row < maze.length - 1) {
            ArrayList<String> left = getPaths(p + 'V', maze, row + 1, col);
            res.addAll(left);
        }

        if(col < maze[0].length - 1) {
            ArrayList<String> right = getPaths(p + 'H', maze, row, col + 1);
            res.addAll(right);
        }

        return res;
    }

    // For three directions - right/vertical 'V', diagonal 'D' and down/horizontal 'H'
    static ArrayList<String> getPathsWithDiagonal(String p, boolean[][] maze, int row, int col) {
        ArrayList<String> res = new ArrayList<>();

        if(row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(!maze[row][col]) {
            return res;
        }

        if(row < maze.length - 1 && col < maze[0].length - 1) {
            ArrayList<String> diagonal = getPathsWithDiagonal(p + 'D', maze, row + 1, col + 1);
            res.addAll(diagonal);
        }

        if(row < maze.length - 1) {
            ArrayList<String> vertical = getPathsWithDiagonal(p + 'V', maze, row + 1, col);
            res.addAll(vertical);
        }

        if(col < maze[0].length - 1) {
            ArrayList<String> horizontal = getPathsWithDiagonal(p + 'H', maze, row, col + 1);
            res.addAll(horizontal);
        }

        return res;
    }
}