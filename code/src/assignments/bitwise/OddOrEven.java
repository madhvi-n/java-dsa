package assignments.bitwise;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(isOdd(23));
        System.out.println(isEven(20));
        System.out.println(isEven(11));
    }

    static boolean isOdd(int num) {
        return (num & 1) == 1;
    }

    static boolean isEven(int num) {
        return (num & 1) != 1;
    }
}