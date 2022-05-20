package assignments.recursion;

public class RecursiveMaxMinElementsOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(maxElement(arr1, arr1.length));
        System.out.println(minElement(arr1, arr1.length));
    }

    static int maxElement(int[] arr, int length) {
        if(length == 1) {
            return arr[0];
        }
        return Math.max(arr[length - 1], maxElement(arr, length - 1));
    }

    static int minElement(int[] arr, int length) {
        if(length == 1) {
            return arr[0];
        }
        return Math.min(arr[length - 1], minElement(arr, length - 1));
    }
}