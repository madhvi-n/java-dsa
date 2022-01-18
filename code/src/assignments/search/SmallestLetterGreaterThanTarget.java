package assignments.search;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'd', 'f', 'j'};

        System.out.println(ceil(letters, 'c'));
        System.out.println(ceil(letters, 'f'));
        System.out.println(ceil(letters, 'j'));

    }

    static char ceil(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while( start <= end) {
            int mid = start + (end - start) / 2;

            if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}