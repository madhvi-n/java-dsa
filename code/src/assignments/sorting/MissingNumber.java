package assignments.sorting;

//  https://leetcode.com/problems/missing-number/

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int[] arr2 = {3,4,-1,1};

        System.out.println(missingNumber(arr));
        System.out.println(missingNumber(arr2));
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int correctIndex = arr[i];
            if(correctIndex > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}