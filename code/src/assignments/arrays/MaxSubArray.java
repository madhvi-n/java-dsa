package assignments.arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(arr));
    }

    static int maxSum(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;

        for (int num: arr) {
            currentSum = Math.max(currentSum + num, num);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}