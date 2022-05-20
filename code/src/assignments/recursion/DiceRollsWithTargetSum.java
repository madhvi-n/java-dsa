package assignments.recursion;

import java.util.ArrayList;

public class DiceRollsWithTargetSum {
    public static void main(String[] args) {
        System.out.println(dice2("", 6, 7));
        System.out.println(diceRollCount("", 2, 6, 7));
        System.out.println(diceRollCount("", 10, 10, 100));
    }

    static void dice(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> dice2(String p, int face, int target) {
        ArrayList<String> result = new ArrayList<>();

        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            if(p.length() == 2) {
                list.add(p);
            }
            return list;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            ArrayList<String> ans = dice2(p + i, face,target - i);
            result.addAll(ans);
        }

        return result;
    }

    //Fixed for two die
    static int diceRollCount(String p, int dices, int face, int target) {
        if(target == 0) {
            if(p.length() == dices) {
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;

        for (int i = 1; i <= face && i <= target; i++) {
            count = count + diceRollCount(p + i, dices, face,target - i);
        }

        return count;
    }

}