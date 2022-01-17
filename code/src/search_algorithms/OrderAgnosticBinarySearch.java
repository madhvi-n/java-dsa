package search_algorithms;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 11, 12, 14, 20, 36, 49};
        int[] arr2 = {49, 36, 20, 14, 12, 11, 8, 6, 4, 2};

        System.out.println(search(arr, 36));
        System.out.println(search(arr2, 36));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if( target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if( target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}