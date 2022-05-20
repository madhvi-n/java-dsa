package assignments.bitwise;

public class EvenProductOfArray {
    public static void main(String[] args) {
        System.out.println(isEvenProduct(new int[]{2,4,3,5}));
        System.out.println(isEvenProduct(new int[]{3,9,7,1}));
    }

    static boolean isEvenProduct(int[] arr) {
        for(int num: arr) {
            if((num & 1) == 0) {
                return true;
            }
        }
        return false;
    }
}