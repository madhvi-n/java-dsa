package assignments.search;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 9, 7, 6, 5, 3};
        System.out.println(find(arr, 3));
        System.out.println(find(arr, 5));
        System.out.println(find(arr, 6));
    }

    static int find(int[] arr, int target) {
        int peak = peak(arr);
        int max = arr[peak];
        if(max == target) {
            return peak;
        }
        int index = search(arr, target, 0, peak - 1, true);
        if(index == -1) {
            index = search(arr, target, peak + 1, arr.length - 1, false);
        }
        return index;
    }

    static int search(int[] arr, int target, int start, int end, boolean asc) {
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

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1] ) {
                // you are in desc part of mountain array
                // search in the left
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // or end because start = end;
    }

}