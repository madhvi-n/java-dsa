package assignments.arrays;

public class FindNumbers {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for(int num: arr) {
            if(even(num)) {
                count ++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = countDigits(num);
        return numberOfDigits % 2 == 0;
    }

    static int countDigits(int num) {
        if(num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }

    static int digits(int num) {
        if(num < 0) {
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }

        int count = 0;
        while(num > 0) {
            num = num/10;
            count ++;
        }
        return count;
    }
}