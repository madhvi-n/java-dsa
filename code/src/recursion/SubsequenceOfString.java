package recursion;

import java.util.ArrayList;

public class SubsequenceOfString {
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
    }

    static ArrayList<String> subSequence2(String str, String ans) {

        if(str.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(ans);
            return result;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = subSequence2(str.substring(1), ans + ch);
        ArrayList<String> right = subSequence2(str.substring(1), ans);

        left.addAll(right);
        return left;
    }
}