package recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(rotatedBinarySearch(arr, 7, 0 , arr.length - 1));
        System.out.println(rotatedBinarySearch(arr, 8, 0 , arr.length - 1));
        System.out.println(rotatedBinarySearch(arr, 89, 0 , arr.length - 1));
        System.out.println(rotatedBinarySearch(arr, 9, 0 , arr.length - 1));
    }

    static int rotatedBinarySearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(arr[start] <= arr[mid]) {
            if(arr[start] <= target && target <= arr[mid]) {
                return rotatedBinarySearch(arr, target, start, mid - 1);
            } else {
                return rotatedBinarySearch(arr, target, mid + 1, end);
            }
        }

        if(arr[mid] <= target && target <= arr[end]) {
            return rotatedBinarySearch(arr, target, mid + 1, end);
        }
        return rotatedBinarySearch(arr, target, start, mid - 1);
    }
}