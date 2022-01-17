package data_structures.arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(10);
        list.add(19);
        list.add(56);
        list.add(32);
        list.add(45);
        list.add(23);

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.contains(56));
        System.out.println(list.contains(99));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(23));
        System.out.println(list.remove(1));
        System.out.println(list);
    }
}