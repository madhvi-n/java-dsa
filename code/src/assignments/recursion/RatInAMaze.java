package assignments.recursion;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int[][] maze = {
            {1, 1, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 1, 0},
            {1, 1, 1, 1}
        };
        printPaths(arr);
        System.out.println(countMazePaths(arr));

        System.out.println();
        printPaths(maze);
        System.out.println(countMazePaths(maze));
    }

    //0 is dead blocks
    static void printPaths(int[][] arr) {
        helper("", arr, 0, 0);
    }

    static int countMazePaths(int[][] arr) {
        return countPaths("", arr, 0, 0);
    }

    static int countPaths(String p, int[][] maze, int row, int col) {
        int count = 0;
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            return 1;
        }

        if(maze[row][col] == 0) {
            return 0;
        }

        if(row < maze.length - 1) {
            count = count + countPaths(p + 'V', maze, row + 1, col);
        }

        if(col < maze[0].length - 1) {
            count = count + countPaths(p + 'H', maze, row, col + 1);
        }
        return count;
    }

    static void helper(String p, int[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(maze[row][col] == 0) {
            return;
        }

        if(row < maze.length - 1) {
            helper(p + 'V', maze, row + 1, col);
        }

        if(col < maze[0].length - 1) {
            helper(p + 'H', maze, row, col + 1);
        }
    }
}