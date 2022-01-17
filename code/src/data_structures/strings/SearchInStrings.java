package data_structures.strings;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String string = "onomatopoeia";
        char target = 'o';
        //char literal uses single quotes
        System.out.println("String: "+ string);
        System.out.println("String to Array "+ Arrays.toString(string.toCharArray()));
        System.out.println("Has char "+ target + ": " + hasChar(string, target));
        System.out.println("Char at "+ target + ": " + search(string, target));
        System.out.println("Count "+ target + ": " + countChar(string, target));
    }

    static boolean hasChar(String string, char target) {
        if(string.length() == 0) {
            return false;
        }

        for(char i: string.toCharArray()) {
            if(i == target) {
                return true;
            }
        }
        return false;
    }

    static int search(String string, char target) {
        if(string.length() == 0) {
            return -1;
        }

        for (int index = 0; index < string.length(); index++) {
            if(string.charAt(index) == target) {
                return index;
            }
        }
        return -1;
    }

    static int countChar(String string, char target) {
        int count = 0;

        if(string.length() == 0) {
            return count;
        }

        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}