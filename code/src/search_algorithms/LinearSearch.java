package search_algorithms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 15, 25, 46};

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        int target = in.nextInt();

        int index = search(arr, target);
        System.out.println(index);

        System.out.println(searchElement(arr, 25));
        System.out.println(hasElement(arr, 46));
    }

    static int search(int[] arr, int target) {
        if(arr.length == 0 ) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == target) {
                return index;
            }
        }

        return -1;
    }

    static int searchElement(int[] arr, int target) {
        if(arr.length == 0 ) {
            return Integer.MAX_VALUE;
        }

        for(int num: arr) {
            if(num == target) {
                return num;
            }
        }

        return Integer.MAX_VALUE;
    }

    static boolean hasElement(int[] arr, int target) {
        for(int num: arr) {
            if(num == target) {
                return true;
            }
        }

        return false;
    }
}