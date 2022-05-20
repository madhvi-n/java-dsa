package assignments.bitwise;

public class NoOfDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(3456, 10));
        System.out.println(countDigits(110110, 2));
    }

    static int countDigits(int n, int base) {
        return (int)(Math.log(n)/ Math.log(base)) + 1;
    }
}