package functions;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        sum();
        int mul = multiply();
        System.out.println("Multiplication: " + mul);

        int cal = calculate(2000, mul);
        System.out.println("Subtracting from 2000: " + cal);

        String message = myGreet();
        /*
            access modifier (OOP) return type name () {
                return statement
            }
         */
    }

    static String myGreet() {
        return "Hello Maya!";
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter the number 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }

    static int multiply() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter the number 2: ");
        int num2 = input.nextInt();

        return num1 * num2;
    }

    static int calculate(int a, int b) {
        return a - b;
    }
}