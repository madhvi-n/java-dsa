package assignments.recursion;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("", "amazon");
        System.out.println(reverseString2("", "leetcode"));
    }

    static void reverseString(String ans, String str) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        reverseString(str.charAt(0) + ans,  str.substring(1));
    }

    static String reverseString2(String ans, String str) {
        if(str.length() == 0) {
            return ans;
        }

        return reverseString2(str.charAt(0) + ans,  str.substring(1));
    }

}