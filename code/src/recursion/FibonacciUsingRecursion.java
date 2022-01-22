package recursion;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        int val = fibonacci(4);
        System.out.println(val);

    }

    //Returns nth fibonacci number
    static int fibonacci(int n) {
        if(n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}