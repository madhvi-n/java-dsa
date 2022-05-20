package recursion;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search(new int[]{1, 2, 3, 4, 4, 5, 6, 4, 7, 8}, 4, 0, list));
        System.out.println(search2(new int[]{1, 2, 3, 4, 7, 5, 6, 4, 7, 8}, 7, 0));
    }

    static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length - 1) {
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        return search(arr, target, index + 1, list);
    }

    static ArrayList<Integer> search2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length - 1) {
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ans = search2(arr, target, index + 1);

        list.addAll(ans);
        return list;
    }
}