package assignments.recursion;

public class SpecialFibonacci {
    public static void main(String[] args) {
//        System.out.println(specialFibonacci(86, 77, 15));
        System.out.println(specialFibonacci(93, 35, 86));
    }

    //Calculates nth special fibonacci for the given inputs

    static int specialFibonacci(int a, int b, int num) {
        if(num < 1) {
            return a;
        }

        if(num == 1) {
            return b;
        }

        return specialFibonacci(a, b, num - 1) ^ specialFibonacci(a, b, num - 2);
    }
}