package assignments.search;

//  https://leetcode.com/problems/search-insert-position/


public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(findInsertPosition(arr, -1));
        System.out.println(findInsertPosition(arr, 2));
        System.out.println(findInsertPosition(arr, 3));
        System.out.println(findInsertPosition(arr, 5));
        System.out.println(findInsertPosition(arr, 7));
    }

    //Returns index of target if target is found, else index of the smallest number than the target
    static int findInsertPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) {
            return end + 1;
        }

        if (target < arr[start]) {
            return 0;
        }

        while(start <= end) {
            int mid = start + (end - start) /2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}