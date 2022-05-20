package basics;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String example = "Hello World";

        System.out.println("Convert into lowercase: " + example.toLowerCase());
        System.out.println("Convert into uppercase: " + example.toUpperCase());
        System.out.println("String length: " + example.length());
        System.out.println("Char at index in string: " + example.charAt(2));
        System.out.println("Returns character array: " + Arrays.toString(example.toCharArray()));
        System.out.println("Trims whitespace: " + example.trim());
        System.out.println("String concatenation: " + example.concat(" !"));
        System.out.println("String contains: " + example.contains("World"));
        System.out.println("Returns index of char o: " + example.indexOf('o'));
        System.out.println("String starts with: " + example.startsWith("He"));
        System.out.println("String ends with: " + example.endsWith("!"));
        System.out.println("Removes whitespaces: " + example.strip());
        System.out.println("Repeat string: " + example.repeat(3));
        System.out.println("Replace target in string: " + example.replace("World", "Maya"));
        System.out.println(Arrays.toString(example.split(" ")));

    }
}