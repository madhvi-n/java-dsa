package assignments;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = number.nextDouble();
        double totalAmount = converter(amount);
        System.out.println("Total amount: " + totalAmount);
    }

    static double converter(double amount) {
        double USDRate = 74.28;
        return amount * USDRate;
    }
}