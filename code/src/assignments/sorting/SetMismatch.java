package assignments.sorting;

import java.util.ArrayList;

//  https://leetcode.com/problems/set-mismatch/

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int[] arr2 = {1,2,2,4};

        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate(arr2));
    }

    static ArrayList<Integer> findDuplicate(int[] arr) {
        int i = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            // Value = index + 1 for range(1, N)
            if(arr[index] != index+1) {
                res.add(arr[index]); // Number at index is the duplicate, so return it
                res.add(index+1); // Number at index is the duplicate, so return it
            }
        }
        return res;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}