package assignments.bitwise;

public class RangeXOR {
    public static void main(String[] args) {
        System.out.println(rangeXOR(3, 9));
    }

    static int rangeXOR(int a, int b) {
        return xor(b) ^ xor(a - 1);
    }

    static int xor(int num) {
        if(num % 4 == 0) {
            return num;
        }

        if(num % 4 == 1) {
            return 1;
        }

        if(num % 4 == 2) {
            return num + 1;
        }

        return 0;
    }
}