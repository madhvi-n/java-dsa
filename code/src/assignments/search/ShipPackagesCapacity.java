package assignments.search;

//  https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/


public class ShipPackagesCapacity {
    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));
        System.out.println(shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 3));
        System.out.println(shipWithinDays(new int[]{1,2,3,1,1}, 4));
    }

    static int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;

        for(int weight: weights) {
            start = Math.max(start, weight);
            end += weight;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int total = 0;
            int subarrays = 1;

            for(int weight: weights) {
                if (total + weight > mid) {
                    total = weight;
                    subarrays ++;
                } else {
                    total += weight;
                }
            }

            if (subarrays > days) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}