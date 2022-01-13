package functions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isArmstrong(num));

        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    static boolean isArmstrong(int a) {
        int num = a;
        int len = String.valueOf(a).length();
        int sum = 0;

        while(a > 0) {
            int rem = a % 10;
            double ans = Math.pow(rem, len);
            sum += ans;
            a = a / 10;
        }

        return sum == num;
    }
}