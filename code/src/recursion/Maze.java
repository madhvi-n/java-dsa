package recursion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println("No of paths in 3x3 maze: " + countPaths(3, 3));
        printPaths("", 3, 3);
        System.out.println();
        System.out.println(getPaths("", 3, 3));
        System.out.println(threeDirectionsMaze("", 3, 3));
    }

    // For two directions - right and down
    static int countPaths(int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }

        int left = countPaths(row - 1, col);
        int right = countPaths(row, col - 1);
        return left + right;
    }

    // For two directions - vertical and horizontal
    static void printPaths(String p, int row, int col) {
        if(row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if(row > 1) {
            printPaths(p + 'V', row - 1, col);
        }

        if(col > 1) {
            printPaths(p + 'H', row, col - 1);
        }
    }

    // For two directions - vertical and horizontal
    static ArrayList<String> getPaths(String p, int row, int col) {
        ArrayList<String> res = new ArrayList<>();

        if(row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(row > 1) {
            ArrayList<String> left = getPaths(p + 'V', row - 1, col);
            res.addAll(left);
        }

        if(col > 1) {
            ArrayList<String> right = getPaths(p + 'H', row, col - 1);
            res.addAll(right);
        }

        return res;
    }

    // For three directions - right/vertical 'V', diagonal 'D' and down/horizontal 'H'
    static ArrayList<String> threeDirectionsMaze(String p, int row, int col) {
        ArrayList<String> res = new ArrayList<>();

        if(row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(row > 1 && col > 1) {
            ArrayList<String> diagonal = threeDirectionsMaze(p + 'D', row - 1, col - 1);
            res.addAll(diagonal);
        }

        if(row > 1) {
            ArrayList<String> vertical = threeDirectionsMaze(p + 'V', row - 1, col);
            res.addAll(vertical);
        }

        if(col > 1) {
            ArrayList<String> horizontal = threeDirectionsMaze(p + 'H', row, col - 1);
            res.addAll(horizontal);
        }

        return res;
    }


}