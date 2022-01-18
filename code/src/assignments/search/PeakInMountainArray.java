package assignments.search;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 9, 7, 6, 4};
        int[] arr2 = {1, 2, 3, 4, 5, 7, 9, 8, 6};
        System.out.println(peak(arr));
        System.out.println(peakIndex(arr));
        System.out.println();
        System.out.println(peak(arr2));
        System.out.println(peakIndex(arr2));
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
        return arr[start]; // or end because start = end;
    }

    static int peakIndex(int[] arr) {
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