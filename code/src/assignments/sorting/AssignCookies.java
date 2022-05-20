package assignments.sorting;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {10, 9, 8, 7};
        int[] s = {5, 6, 7, 8};

        System.out.println(assignCookies(g, s));
    }

    static int assignCookies(int[] g, int[] s) {
        int count = 0;
        int index = 0;

        sort(g);
        sort(s);

        System.out.println(Arrays.toString(g));
        System.out.println(Arrays.toString(s));

        for (int j : s) {
            if (index < g.length && j >= g[index]) {
                count++;
                index++;
            }
        }
        return count;
    }

    static void sort(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}