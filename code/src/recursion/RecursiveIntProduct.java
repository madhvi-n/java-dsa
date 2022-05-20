package recursion;

public class RecursiveIntProduct {
    public static void main(String[] args) {
        System.out.println(product(10,12));
    }

    static int product(int a, int b) {
        System.out.println(a + ", " + b);
        if(a < b) {
            return product(b, a);
        }

        if(b == 0) {
            return 0;
        }

        return a + product(a, b - 1);
    }
}