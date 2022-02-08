package assignments.arrays;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] image2 = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        System.out.println(Arrays.deepToString(flipImage(image)));
        System.out.println(Arrays.deepToString(flipImage(image2)));
    }

    static int[][] flipImage(int[][] image) {
        for (int[] row: image) {
            reverseArray(row);
            for (int index = 0; index < row.length; index++) {
                row[index] = row[index] ^ 1;
            }
        }
        return image;
    }

    static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}