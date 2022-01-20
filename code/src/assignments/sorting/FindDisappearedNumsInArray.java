package assignments.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDisappearedNumsInArray {
    public static void main(String[] args) {
        int[] arr =  {4,3,2,7,8,2,3,1};
        System.out.println(find(arr));
    }

    static ArrayList<Integer> find(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
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
                res.add(index+1);
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