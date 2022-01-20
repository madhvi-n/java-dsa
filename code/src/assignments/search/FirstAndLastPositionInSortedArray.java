package assignments.search;

import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 8, 8, 8, 10, 10, 10, 10, 10};
        System.out.println(Arrays.toString(findPosition(arr, 3)));
        System.out.println(Arrays.toString(findPosition(arr, 5)));
        System.out.println(Arrays.toString(findPosition(arr, 7)));
        System.out.println(Arrays.toString(findPosition(arr, 8)));
        System.out.println(Arrays.toString(findPosition(arr, 10)));
    }

    static int[] findPosition(int[] arr, int target) {
        int ans[] = {-1, -1};
        ans[0] = search(arr, target, true);
        if(ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
    }

    //Returns index of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while( start <= end) {
            int mid = start + (end - start) / 2;

            if(target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;
            } else {
                // the main logic
                ans = mid;
                if(findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}