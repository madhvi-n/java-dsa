package search_algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 20, 36};
//        int[] arr2 = {49, 36, 20, 14, 12, 11, 8, 6, 4, 2};

        System.out.println(binarySearch(arr, 12));
//        System.out.println(binarySearchDesc(arr2, 36));
    }

//    Ascending order array
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while( start <= end) {
            int mid = start + (end - start) / 2;

            if( target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

//    Descending order array
    static int binarySearchDesc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while( start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}