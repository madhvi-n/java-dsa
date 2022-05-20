package assignments.bitwise;

public class IthBitOfNum {
    public static void main(String[] args) {
        System.out.println(find(101100, 3));
        System.out.println(find(10110110, 5));
    }

    static int find(int num, int n) {
        int mask = 1 << ( n - 1);
        return num & mask;
    }
}