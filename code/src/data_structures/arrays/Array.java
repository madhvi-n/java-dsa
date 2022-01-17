package data_structures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println(numbers[1]);

        String[] arr;
        arr = new String[]{"One", "Two"};
        System.out.println(arr[1]);

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        in.close();

        for (int number : numbers) {
            System.out.println(number + " ");
        }

        System.out.println(Arrays.toString(numbers));
    }
}