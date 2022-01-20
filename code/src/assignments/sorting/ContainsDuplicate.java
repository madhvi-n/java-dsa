package assignments.sorting;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        int[] arr2 = {1,2,3,1};
        int[] arr3 = {1,2,3,4};
        int[] arr4 = {3, 3};
        int[] arr5 = {3, 1};

        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate(arr2));
        System.out.println(findDuplicate(arr3));
        System.out.println(findDuplicate(arr4));
        System.out.println(findDuplicate(arr5));
    }

    static boolean findDuplicate(int[] arr) {
        int i = 0;

        if(arr.length  == 1) {
            return false;
        }

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(correctIndex < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1) {
                return true;
            }
        }
        return false;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}