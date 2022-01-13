package conditionals;

import java.util.Scanner;

public class SwitchLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        String berry = input.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Pie fruit");
            case "berries" -> {
                System.out.println("Oh berries! What kind of berry?");
                switch (berry) {
                    case "strawberry" -> System.out.println("Pink berry");
                    case "blueberry" -> System.out.println("Blue berry");
                    case "blackberry" -> System.out.println("Black berry");
                }
            }
            default -> System.out.println("Enter a valid fruit");
        }

    }
}