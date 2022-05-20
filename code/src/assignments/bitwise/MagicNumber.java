package assignments.bitwise;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(magicNum(6, 5));
        System.out.println(magicNum(5, 5));
        System.out.println(magicNum(10, 8));
    }

    static int magicNum(int n, int base) {
        int ans = 0;

        while(n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}