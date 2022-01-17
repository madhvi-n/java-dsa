package data_structures.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mlist = new ArrayList<>();

        //Initialization
        for (int i = 0; i < 3; i++) {
            mlist.add(new ArrayList<>());
        }

        System.out.println(mlist);

        //Add elements to the 2D array list
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mlist.get(i).add(in.nextInt());
            }
        }

        System.out.println(mlist);

    }
}