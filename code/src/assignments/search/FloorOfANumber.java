package assignments.search;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 15, 18, 22};
        int[] arr2 = {22, 18, 15, 14, 9, 5, 3, 2};

        System.out.println(search(arr, 14));
        System.out.println(search(arr, 6));
        System.out.println(search(arr, 9));
        System.out.println(search(arr, 17));
    }

    // Returns index of the smallest number smaller than or equal to target
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while( start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return arr[mid];
            }

            if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}