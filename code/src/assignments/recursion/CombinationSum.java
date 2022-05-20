package assignments.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
        System.out.println(combinationSum(new int[]{2,3,5}, 8));
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        return helper(candidates, target, 0, new ArrayList<>());
    }


    static List<List<Integer>> helper(int[] candidates, int target, int start, List<Integer> curList) {
        List<List<Integer>> res = new ArrayList<>();

        if (target == 0) {
            res.add(curList);
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                List<Integer> list = new ArrayList<>(curList);
                list.add(candidates[i]);
                return helper(candidates, target - candidates[i], i, list);
            }
        }
        return res;
    }

}