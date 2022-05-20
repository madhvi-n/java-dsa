package assignments.functions;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Find fibonacci series with n elements: ");
        int num = in.nextInt();

        String series = fibonacci(num);
        System.out.println(series);

        System.out.println(fib(10));
    }

    static String fibonacci(int range) {
        int first = 0;
        int second = 1;
        int[] res = new int[range];

        for (int i = 1; i < range; i++) {
            int next = first + second;
            res[i] = next;
            first = second;
            second = next;
        }

        return Arrays.toString(res);
    }

    static long fib(int n) {
        double num;
        double a = Math.pow((1 + Math.sqrt(5))/ 2, n);
//        double b = Math.pow((1 - Math.sqrt(5))/ 2, n);
        num = 1/Math.sqrt(5) * a;
        return (long) num;
    }
}