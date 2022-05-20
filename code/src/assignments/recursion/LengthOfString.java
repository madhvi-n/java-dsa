package assignments.recursion;

public class LengthOfString {
    public static void main(String[] args) {
        lengthOfString("leetcode", 0);
        lengthOfString("geeksforgeeks", 0);
    }

    static void lengthOfString(String str, int count) {
        if(str.length() == 0) {
            System.out.println(count);
            return;
        }
        lengthOfString(str.substring(1), count + 1);
    }
}