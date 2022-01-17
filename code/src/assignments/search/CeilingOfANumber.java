package assignments.search;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 15, 18, 22};
        int[] arr2 = {22, 18, 15, 14, 9, 5, 3, 2};

        // Number
        System.out.println(search(arr, 14));
        System.out.println(search(arr, 16));

        //Indexes
        System.out.println(ceil(arr, 9));
        System.out.println(ceil(arr, 17));

        // Number
        System.out.println(search(arr2, 9));
        System.out.println(search(arr2, 17));
    }

    // Returns index of the smallest number greater than or equal to target
    static int ceil(int[] arr, int target) {
        //Check if target is greater than last element
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while( start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if(target > arr[mid]) {
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    // Returns ceil of a target irrespective of sorting order
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while( start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return arr[mid];
            }

            if(isAsc) {
                if(target > arr[mid]) {
                    start = mid +1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(target < arr[mid]) {
                    start = mid +1;
                } else {
                    end = mid - 1;
                }
            }
        }

        if(isAsc){
            return arr[start];
        }
        return arr[end];
    }

}