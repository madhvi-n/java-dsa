package assignments.search;


public class NegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][] grid2 = {{3,2}, {1,0}};
        int[][] grid3 = {{3,2}, {1,0, -1}};
        System.out.println(countNegatives(grid));
        System.out.println(countNegatives(grid2));
        System.out.println(countNegatives(grid3));
    }

    static int countNegatives(int[][] grid) {
        int count = 0;

        for (int[] arr: grid) {
            int start = arr[0];
            int end = arr[arr.length - 1];

            if(start == 0 || end == 0) {
                count += 0;
            } else  {
                int index = searchPosition(arr, 0);

            }
        }
        return count;
    }

    static int searchPosition(int[] arr, int target) {
        return -1;
    }
}