package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetOfArray {
    public static void main(String[] args) {
        System.out.println(subset(new int[] {1,2,3}));
        System.out.println(subsetWithDuplicates(new int[] {1,2,2}));
    }

    // Time complexity: O(2 ^ n * n)
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());

        for(int num: arr) {
            int size = outerList.size();

            for (int i = 0; i < size; i++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(num);
                outerList.add(innerList);
            }
        }
        return outerList;
    }

    static List<List<Integer>> subsetWithDuplicates(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> outerList = new ArrayList<>();
        int start = 0;
        int end = 0;

        outerList.add(new ArrayList<>());

        for(int i = 0; i < arr.length; i++) {
            start = 0;

            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outerList.size() - 1;
            int n = outerList.size();

            for (int j = start; j < n; j++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(j));
                innerList.add(arr[i]);
                outerList.add(innerList);
            }
        }
        return outerList;
    }


}