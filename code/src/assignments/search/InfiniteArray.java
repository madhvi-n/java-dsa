package assignments.search;

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 14, 15, 16, 20};
        System.out.println(findRange(arr, 15));
    }

    static int findRange(int[] arr, int target) {
        // start with 2
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr, target, start, end);
    }

    static int search(int[] nums, int target, int start, int end) {
        int ans = -1;

        while( start <= end) {
            int mid = start + (end - start) / 2;

            if(target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;
            } else {
                // the main logic
                return mid;
            }
        }
        return ans;
    }
}