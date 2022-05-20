package assignments.recursion;

public class RecursiveFirstUpperCase {
    public static void main(String[] args) {
        System.out.println(firstUpperCaseIndex("geeksforGeeks", 0));
        System.out.println(firstUpperCaseIndex("leetcOde", 0));
        System.out.println();
        System.out.println(firstUpperCase("amazoN"));
    }

    static int firstUpperCaseIndex(String s, int index) {
        if(s.length() == index) {
            return -1;
        }
        if(Character.isUpperCase(s.charAt(index))) {
            return index;
        }
        return firstUpperCaseIndex(s, index + 1);
    }

    static char firstUpperCase(String s) {
        if(s.length() == 0) {
            return '-';
        }
        if(Character.isUpperCase(s.charAt(0))) {
            return s.charAt(0);
        }
        return firstUpperCase(s.substring(1));
    }
}