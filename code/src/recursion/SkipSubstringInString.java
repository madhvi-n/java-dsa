package recursion;

public class SkipSubstringInString {
    public static void main(String[] args) {
        String str = "babccadehg";
        System.out.println(skipChar2(str, "bcc"));
    }

    static String skipChar2(String str, String sub) {
        if(str.isEmpty()) {
            return "";
        }

        if(str.startsWith(sub)) {
            return skipChar2(str.substring(sub.length()), sub);
        } else{
            return str.charAt(0) + skipChar2(str.substring(1), sub);
        }
    }
}