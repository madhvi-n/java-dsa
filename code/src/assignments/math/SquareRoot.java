package assignments.math;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrtRoot(196));
    }

    static int sqrtRoot(int num) {
        int start = 0;
        int end = num;

        while(start < end) {
            int mid = start + (end - start);
            int sqr = mid * mid;

            if(sqr == num) {
                return mid;
            }

            if(sqr > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //Using newton raphson square method

}