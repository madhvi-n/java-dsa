package recursion;

import java.util.ArrayList;

public class SubsequenceOfASCII {
    public static void main(String[] args) {
        subSequence("abc", "");
        System.out.println(subSequence2("abc", ""));
    }

    static void subSequence(String str, String ans) {
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        
        subSequence(str.substring(1), ans + ch);
        subSequence(str.substring(1), ans);
        subSequence(str.substring(1), ans + (ch + 0));
    }

    static ArrayList<String> subSequence2(String str, String ans) {

        if(str.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(ans);
            return result;
        }

        char ch = str.charAt(0);

        ArrayList<String> first = subSequence2(str.substring(1), ans + ch);
        ArrayList<String> second = subSequence2(str.substring(1), ans);
        ArrayList<String> third = subSequence2(str.substring(1), ans + (ch + 0));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}