package assignments.bitwise;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,6,4,3};
        System.out.println(singleNumber(arr));
    }

    static int singleNumber(int[] arr) {
        int unique = 0;

        for (int num: arr) {
            unique ^= num;
        }
        return unique;
    }
}