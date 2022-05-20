package assignments.math;

import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        System.out.println(factors1(20));
        System.out.println(factors2(38));
    }

    static ArrayList<Integer> factors1(int num) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if(num % i == 0) {
                res.add(i);
            }
        }
        return res;
    }

    static ArrayList<Integer> factors2(int num) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                res.add(i);
                if(!(num/i == i)) {
                    res.add(num/i);
                }
            }
        }
        return res;
    }

}