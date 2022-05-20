package assignments.recursion;

public class FirstUpperCase {
    public static void main(String[] args) {
        System.out.println(firstUpperCaseIndex("GeeksForGeeks"));
        System.out.println(firstUpperCaseIndex("leetcOde"));
        System.out.println(firstUpperCaseIndex("amazon"));

        System.out.println();

        System.out.println("Count uppercase chars");
        System.out.println(countUpperCaseChars("GeeksForGeeks"));
        System.out.println(countUpperCaseChars("leetcOde"));
        System.out.println(countUpperCaseChars("amazon"));

        System.out.println();

        System.out.println("First uppercase char");
        System.out.println(firstUpperCaseChar("GeeksForGeeks"));
        System.out.println(firstUpperCaseChar("leetcOde"));
        System.out.println(firstUpperCaseChar("amazon"));
    }

    static int firstUpperCaseIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    static int countUpperCaseChars(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                count = count + 1;
            }
        }
        return count;
    }

    static char firstUpperCaseChar(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return '-';
    }
}