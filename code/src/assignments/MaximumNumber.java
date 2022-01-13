package assignments;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        input.close();

        if(num1 > num2) {
            System.out.println("Maximum number:"+ num1);
        }
        System.out.println("Maximum number: " + num2);
    }
}