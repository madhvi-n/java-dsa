package assignments.patterns;

public class NumPatterns {
    public static void main(String[] args) {
        pattern4(4);
        System.out.println();

        pattern16(4);
        System.out.println();

        pattern17(4);
        System.out.println();

        pattern21(4);
        System.out.println();

        pattern22(4);
        System.out.println();

        pattern26(4);
        System.out.println();

        pattern27(4);
        System.out.println();

        pattern30(4);
        System.out.println();

        pattern31(4);
        System.out.println();

        pattern35(4);
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern16(int n) {

    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            // for every row, run the col
            int c = row > n ? 2 * n - row : row;

            for (int i = 0; i < n - c ; i++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern21(int n) {

    }

    static void pattern22(int n) {

    }

    static void pattern26(int n) {

    }

    static void pattern27(int n) {

    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int i = 0; i < n - row ; i++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row < n; row++) {
            // for every row, run the col
            for (int col = 0; col < n; col++) {
                int index = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(index + " ");
            }
            // after every row, add a new line
            System.out.println();
        }
    }

    static void pattern35(int n) {

    }
}