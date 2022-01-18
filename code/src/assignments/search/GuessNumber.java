package assignments.search;

public class GuessNumber {
    public static void main(String[] args) {
        int pick = 18;
        int range = 25;
        System.out.println(findNumber(range, pick));
    }

    static int findNumber(int n, int pick) {
        int start = 0;
        int end = n;
        int mid = 0;

        while(start <= end) {
            mid = start + (end - start) / 2;
            int res = guess(mid, pick);

            if(res == -1) {
                end = mid - 1;
            } else if(res == 1) {
                start = mid + 1;
            }
        }
        return mid;
    }

    static int guess(int num, int pick) {
        return Integer.compare(pick, num);
    }

}