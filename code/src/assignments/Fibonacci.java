package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Find fibonacci series with n elements: ");
        int num = in.nextInt();

        String series = fibonacci(num);
        System.out.println(series);
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
}