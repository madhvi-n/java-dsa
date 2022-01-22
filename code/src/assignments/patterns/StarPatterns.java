package assignments.patterns;

import java.sql.SQLOutput;

public class StarPatterns {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println();

        pattern2(4);
        System.out.println();

        pattern3(4);
        System.out.println();

        pattern5(4);
        System.out.println();

        pattern6(4);
        System.out.println();

        pattern7(4);
        System.out.println();

        pattern8(4);
        System.out.println();

        pattern9(4);
        System.out.println();

        pattern10(4);
        System.out.println();

        pattern11(4);
        System.out.println();

        pattern12(4);
        System.out.println();

        pattern13(4);
        System.out.println();

        pattern14(4);
        System.out.println();

        pattern15(4);
        System.out.println();

        pattern18(5);
        System.out.println();

        pattern19(4);
        System.out.println();

        pattern20(4);
        System.out.println();

        pattern23(4);
        System.out.println();

        pattern24(4);
        System.out.println();

        pattern25(4);
        System.out.println();

        pattern28(4);
        System.out.println();

        pattern29(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            // for every row, run the col
            int count = row > n ? 2 * n - row : row;
            for (int col = 0; col < count; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            int spaces = n - row;

            for (int i = 0; i <= spaces; i++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = n; row > 0; row--) {
            // for every row, run the col
            int spaces = n - row;

            for (int i = 0; i <= spaces; i++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            int spaces = n - row;

            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }

            for (int col = 1; col < 2 * row; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = n; row > 0; row--) {
            // for every row, run the col
            int spaces = n - row;

            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }

            for (int col = 1; col < 2 * row; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            int spaces = n - row;

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = n; row > 0; row--) {
            // for every row, run the col
            int spaces = n - row;

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            // for every row, run the col
            int totalColsInRow = row > n ? row - n : n - row + 1;
            int noOfSpaces = n - totalColsInRow;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            int spaces = n - row;

            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }

            for (int col = 1; col < 2 * row; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern14(int n) {

    }

    static void pattern15(int n) {
        for (int row = 1; row < 2 * n; row++) {
            // for every row, run the col
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                if(col == 0 || col == totalColsInRow - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern18(int n) {
        for (int row = 1; row < 2 * n; row++) {
            // for every row, run the col
            for (int col = 1; col <= 2 * n; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern19(int n) {

    }

    static void pattern20(int n) {

    }

    static void pattern23(int n) {

    }

    static void pattern24(int n) {

    }

    static void pattern25(int n) {

    }

    static void pattern28(int n) {
        for (int row = 1; row < 2 * n; row++) {
            // for every row, run the col
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern29(int n) {

    }
}