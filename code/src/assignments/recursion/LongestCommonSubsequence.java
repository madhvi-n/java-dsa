package assignments.recursion;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(lcs("", "analogy", "alchemy"));
    }

    static String lcs(String ans, String t1, String t2) {
        if(t1.isEmpty() || t2.isEmpty()) {
            System.out.println(ans);
            return "";
        }

        if(t1.charAt(0) == t2.charAt(0)) {
            return lcs(ans + t1.charAt(0), t1.substring(1), t2.substring(1));
        }

        if(t1.length() > t2.length()) {
            return lcs(ans, t1.substring(1), t2);
        } else {
            return lcs(ans, t1, t2.substring(1));
        }
    }
}