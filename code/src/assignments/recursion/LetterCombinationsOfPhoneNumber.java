package assignments.recursion;

import java.util.ArrayList;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        letters("", "23");
        System.out.println(letterCombination("", "23"));
        System.out.println(letterCombination("", "2"));
    }

    static ArrayList<String> letterCombination(String p, String up) {
        ArrayList<String> result = new ArrayList<>();
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0' - 1;


        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ArrayList<String> ans = letterCombination(p + ch, up.substring(1));
            result.addAll(ans);
        }
        return result;
    }

    static void letters(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0' - 1;

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            letters(p + ch, up.substring(1));
        }
    }
}