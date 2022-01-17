package assignments.functions;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your principal amount: ");
        long principal = number.nextLong();

        System.out.print("Enter the time period (in years): ");
        int time = number.nextInt();

        System.out.print("Enter the rate of interest: ");
        float rate = number.nextFloat();

        double totalAmount = calculate(principal, time, rate);
        System.out.println("Total amount: " + totalAmount);
    }

    static double calculate(long principal, int time, float rate) {
        float interest = (principal * rate * time) / 100;
        return principal + interest;
    }
}