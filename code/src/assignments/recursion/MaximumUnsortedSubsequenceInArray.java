package assignments.recursion;

import java.util.Arrays;

public class MaximumUnsortedSubsequenceInArray {
    public static void main(String[] args) {
        int[] arr =  {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        System.out.println(Arrays.toString(maxSubsequence(arr)));
    }

    static int[] maxSubsequence(int[] arr) {

        return new int[]{-1, -1};
    }
}