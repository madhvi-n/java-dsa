package assignments.search;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(1));
    }

    static int firstBadVersion(int n) {
        int start = 0;
        int end = n;

        while(start < end) {
            int mid =  start + (end - start) / 2;
            boolean check = isBadVersion(n);
            if(check) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // Dummy code for isBadVersion api of leetcode
    static boolean isBadVersion(int n) {
        return true;
    }
}