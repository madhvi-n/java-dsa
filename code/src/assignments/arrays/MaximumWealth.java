package assignments.arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 7, 3},
                {3, 3, 2},
                {3, 3, 7},
                {8, 8, 8}
        };
        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] person : accounts) {
            int wealth = 0;
            for (int account: person) {
                wealth += account;
            }

            if(wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}