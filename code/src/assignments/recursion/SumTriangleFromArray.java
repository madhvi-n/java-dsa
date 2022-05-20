package assignments.recursion;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[] arr = {1 ,2, 3, 4, 5};
        printSumTriangle(arr);
    }

    static void printSumTriangle(int[] arr) {
        if(arr.length < 1) {
            return;
        }

        int[] tempArray = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            tempArray[i] = arr[i] + arr[i+1];
        }

        printSumTriangle(tempArray);
        System.out.println(Arrays.toString(arr));
    }
}