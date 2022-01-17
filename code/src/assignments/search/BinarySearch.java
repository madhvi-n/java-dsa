package assignments.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 15, 18, 22};
        int[] arr2 = {22, 18, 15, 14, 9, 5, 3, 2};

        System.out.println(searchIndex(arr, 2));
        System.out.println(searchIndex(arr2, 3));
    }

    // Returns index of the target (irrespective of sorting order) if found, else -1
    static int searchIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if(isAsc) {
                if(target > arr[mid]) {
                    start = mid +1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(target < arr[mid]) {
                    start = mid +1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}