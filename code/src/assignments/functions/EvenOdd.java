package assignments.functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int number = input.nextInt();
        boolean ans = is_even(number);

        if (ans) {
            System.out.println(number + " is a even number");
        }
        System.out.println(number + " is an odd number");

    }

    static boolean is_even(int num) {
        return num % 2 == 0;
    }
}