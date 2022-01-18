package assignments.search;

//  https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 8, 10};
        System.out.println(splitArray(arr, 2));
        System.out.println(splitArray(arr, 3));
    }

    static int splitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;

        for(int num: arr) {
            // Start will be the max element from the array
            start = Math.max(start, num);
            end += num;
        }

        //Binary search

        while(start < end) {
            // Try for middle as the potential answer
            int mid = start + (end - start) / 2;

            // calculates how many sub arrays can be formed with the max sum
            int sum = 0;
            int subarrays = 1;

            for (int num: arr) {
                if(sum + num > mid) {
                    // Creates new sub array if sum + num exceeds max
                    sum = num;
                    subarrays ++;
                } else {
                    // add num to the sum till it's below max sum
                    sum += num;
                }
            }

            if (subarrays > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; //Start, end and mid will be same here
    }
}