package assignments.sorting;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int[] arr2 = {3,1,3,4,2};

        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate(arr2));
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            // Value = index + 1 for range(1, N)
            if(arr[index] != index+1) {
                return arr[index]; // Number at index is the duplicate, so return it
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}