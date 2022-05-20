package recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permutation2("", "abc"));
        System.out.println(permutationCount("", "abc"));
        System.out.println();
        System.out.println(permutation2("", "abcd"));
        System.out.println(permutationCount("", "abcd"));
    }

    static void permutation(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }

    static ArrayList<String> permutation2(String p, String up) {
        ArrayList<String> res = new ArrayList<>();

        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);


        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            res.addAll(permutation2(first + ch + second, up.substring(1)));
        }
        return res;
    }

    static int permutationCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);

        int count = 0;
        
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + permutationCount(first + ch + second, up.substring(1));
        }
        return count;
    }
}