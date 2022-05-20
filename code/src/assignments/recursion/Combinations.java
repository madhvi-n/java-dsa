package assignments.recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        combinations(1, 1);
        combinations(4, 2);
        combinations(4, 3);
    }

    static void combinations(int n, int k) {
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());

        for(int i = 1; i <= n; i ++) {
            int size = outerList.size();

            for (int j = i; i < n; i++) {
                List<Integer> innerList = new ArrayList<>();
                innerList.add(i);
                outerList.add(innerList);
            }
        }

        System.out.println(outerList);
    }
}