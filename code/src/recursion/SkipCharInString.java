package recursion;

public class SkipCharInString {
    public static void main(String[] args) {
        String str = "baccadehg";
        String str2 = "baccddccadehg";

        skipChar("", str);
        System.out.println();
        System.out.println(skipChar2(str2));
    }

    static void skipChar(String ans, String str) {
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        if(ch == 'a') {
            skipChar(ans, str.substring(1));
        } else{
            skipChar(ans + ch, str.substring(1));
        }
    }

    static String skipChar2(String str) {
        if(str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a') {
            return skipChar2(str.substring(1));
        } else{
            return ch + skipChar2(str.substring(1));
        }
    }
}