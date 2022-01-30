package assignments.search;

//  https://leetcode.com/problems/valid-mountain-array/

public class ValidMountainArray {
    public static void main(String[] args) {
        System.out.println(validateArray(new int[] {2, 1}));
        System.out.println(validateArray(new int[] {1, 2, 1}));
        System.out.println(validateArray(new int[] {2, 2, 2, 2, 2}));
        System.out.println(validateArray(new int[] {0, 2, 3, 5, 3, 2 ,1, 0}));
    }

    static boolean validateArray(int[] arr) {
        // If array length is less than 3, return false
        if (arr.length < 3) {
            return false;
        }

        // Find peak
        int peak = findPeak(arr);

        // If peak is at the start or the end, return false
        if(peak == 0 || peak == arr.length - 1) {
            return false;
        }

        // Else peak lies somewhere between the start and the end
        // Check if elements before the peak are in asc order and elements after the peak in desc order
        return checkArray(arr, 0 , peak) & checkArray(arr, peak + 1, arr.length - 1);
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static boolean checkArray(int[] arr, int start, int end) {
        boolean isAscending = arr[start] < arr[end];

        for (int index = start; index < end; index++) {
            if (isAscending) {
                if(!(arr[index] < arr[index+1])) {
                    return false;
                }
            } else {
                if(!(arr[index] > arr[index+1])) {
                    return false;
                }
            }
        }
        return true;
    }

}